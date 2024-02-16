package umc.beanstalk.choice.service;

import umc.beanstalk.choice.data.dto.ChoiceResponse;

public interface ChoiceQueryService {
	public ChoiceResponse.GetChoiceImage getChoiceImage(Long questionId, Long choiceId);
}
