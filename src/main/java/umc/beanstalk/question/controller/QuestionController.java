package umc.beanstalk.question.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
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

	@GetMapping("/{qNum}")
	@Operation(summary = "질문 & 객관식 조회 API", description = "질문 번호를 pathvariable")
	public ApiResult<QuestionResponse.GetQuestionByNumRes> getQuestion(@PathVariable int qNum){

		return null;
	}



}
