package umc.beanstalk.question.service;

import umc.beanstalk.question.data.dto.QuestionResponse;

public interface QuestionQueryService {
	public QuestionResponse.GetQuestionByNumRes getQuestionByNumRes(int qNum);
}
