package umc.beanstalk.question.data.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

public class QuestionResponse {
	@Getter
	@Builder
	public static class GetQuestionRes{
		Long questionId;
		String qText;
		List<GetChoiceRes> choices;
	}
	@Getter
	@Builder
	public static class GetChoiceRes{
		Long choiceId;
		String cText;
	}
}
