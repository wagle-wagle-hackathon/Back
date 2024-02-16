package umc.beanstalk.choice.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.data.dto.ChoiceResponse;
import umc.beanstalk.choice.repository.ChoiceRepository;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.handler.ChoiceHandler;
import umc.beanstalk.question.data.domain.Question;
import umc.beanstalk.question.data.dto.QuestionResponse;

@Service
@RequiredArgsConstructor
public class ChoiceQueryServiceImpl implements ChoiceQueryService {
	private final ChoiceRepository choiceRepository;
	@Override
	public List<QuestionResponse.GetChoiceRes> getChoicesByQuestionGender(Question question, Integer gender) {
		List<Choice> choices = choiceRepository.findAllByQuestionAndGender(question, gender)
			.orElseThrow(() -> new ChoiceHandler(ErrorStatus.CHOICE_NOT_FOUND));

		return choices.stream().map(choice ->
			QuestionResponse.GetChoiceRes.builder()
				.choiceId(choice.getChoiceId())
				.cText(choice.getCText())
				.build()).collect(Collectors.toList());
	}
}
