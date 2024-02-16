package umc.beanstalk.question.data.dto;

import java.util.List;

import lombok.Getter;

public class QuestionResponse {
	@Getter
	public static class GetQuestionByNumRes{
		String qText;
		List<GetChoiceByNumRes> ChoiceByNumRes;
	}
	public static class GetChoiceByNumRes{
		Long choiceId;
		String cText;
	}
}
