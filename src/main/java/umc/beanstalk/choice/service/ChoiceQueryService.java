package umc.beanstalk.choice.service;

import java.util.List;

import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.data.dto.ChoiceResponse;
import umc.beanstalk.question.data.domain.Question;
import umc.beanstalk.question.data.dto.QuestionResponse;

public interface ChoiceQueryService {
	public List<QuestionResponse.GetChoiceRes> getChoicesByQuestionGender(Question question, Integer gender);
}
