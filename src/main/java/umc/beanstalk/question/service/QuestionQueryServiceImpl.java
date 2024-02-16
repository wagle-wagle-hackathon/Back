package umc.beanstalk.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.choice.service.ChoiceQueryService;
import umc.beanstalk.question.data.domain.Question;
import umc.beanstalk.question.data.dto.QuestionResponse;
import umc.beanstalk.question.repository.QuestionRepository;

@Service
@RequiredArgsConstructor
public class QuestionQueryServiceImpl implements QuestionQueryService{
	private final QuestionRepository questionRepository;
	private final ChoiceQueryService choiceQueryService;
	@Override
	public List<QuestionResponse.GetQuestionRes> getQuestion(Integer gender) {
		List<Question> questions = questionRepository.findAll();

		return questions.stream().map(question ->
			QuestionResponse.GetQuestionRes.builder()
				.questionId(question.getQuestionId())
				.qText(question.getQText())
				.choices(choiceQueryService.getChoicesByQuestionGender(question, gender))
				.build()).toList();
	}
}
