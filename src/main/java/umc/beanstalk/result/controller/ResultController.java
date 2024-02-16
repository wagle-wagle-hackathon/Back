package umc.beanstalk.result.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.result.service.ResultService;

import java.lang.management.LockInfo;

@RestController
@RequiredArgsConstructor
@RequestMapping("result")
public class ResultController {
    private final ResultService resultService;

    @GetMapping("/{resultId}")
    private ApiResult<?> show(@PathVariable Long ResultId){
        return ApiResult.onSuccess(resultService.show(ResultId));
    }


    @PostMapping("/{resultId}")
    private ApiResult<?> insert(@PathVariable Long ResultId){
        return ApiResult.onSuccess(resultService.show(ResultId));
    }
}
