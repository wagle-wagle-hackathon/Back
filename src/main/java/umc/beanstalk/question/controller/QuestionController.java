package umc.beanstalk.question.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.question.data.dto.QuestionResponse;
import umc.beanstalk.question.service.QuestionQueryService;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/questions")
public class QuestionController {
	private final QuestionQueryService questionQueryService;
	@GetMapping("")
	@Operation(summary = "질문 & 객관식 리스트 조회 API", description = "질문 리스트 & 객관식 리스트 조회")
	@Parameter(name = "gender", description = "Query String으로 성별을 주세요 (0: 남자, 1: 여자)")
	public ApiResult<List<QuestionResponse.GetQuestionRes>> getQuestion(@RequestParam Integer gender){
		List<QuestionResponse.GetQuestionRes> getQuestionResList = questionQueryService.getQuestion(gender);
		return ApiResult.onSuccess(getQuestionResList);
	}

}
