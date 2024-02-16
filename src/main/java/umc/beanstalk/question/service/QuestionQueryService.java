package umc.beanstalk.question.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.question.data.dto.QuestionResponse;

public interface QuestionQueryService {
	public List<QuestionResponse.GetQuestionRes> getQuestion(Integer gender);
}
