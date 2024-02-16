package umc.beanstalk.choice.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.choice.data.dto.ChoiceResponse;

@Service
@RequiredArgsConstructor
public class ChoiceQueryServiceImpl implements ChoiceQueryService {
	@Override
	public ChoiceResponse.GetChoiceImage getChoiceImage(Long questionId, Long choiceId) {
		return null;
	}
}
