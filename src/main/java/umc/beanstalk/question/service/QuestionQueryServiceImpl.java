package umc.beanstalk.question.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.question.data.dto.QuestionResponse;

@Service
@RequiredArgsConstructor
public class QuestionQueryServiceImpl implements QuestionQueryService{
	@Override
	public QuestionResponse.GetQuestionByNumRes getQuestionByNumRes(int qNum) {
		return null;
	}
}
