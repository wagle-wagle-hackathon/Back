package umc.beanstalk.choice.service;

import java.util.List;

import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.question.data.domain.Question;
import umc.beanstalk.question.data.dto.QuestionResponse;
import umc.beanstalk.user.data.domain.User;

public interface ChoiceQueryService {
	public List<QuestionResponse.GetChoiceRes> getChoicesByQuestionGender(Question question, Integer gender);

	public List<String> getChoiceAdivcesByUserAndResultId(User user, Long resultId);
}
