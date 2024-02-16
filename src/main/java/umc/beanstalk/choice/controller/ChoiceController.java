package umc.beanstalk.choice.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import umc.beanstalk.choice.service.ChoiceQueryService;
import umc.beanstalk.common.apiPayload.ApiResult;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/choice")
public class ChoiceController {
}
