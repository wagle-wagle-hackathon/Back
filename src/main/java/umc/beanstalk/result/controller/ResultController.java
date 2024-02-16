package umc.beanstalk.result.controller;

import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.result.service.ResultService;

import java.lang.management.LockInfo;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("result")
public class ResultController {
    private final ResultService resultService;

    //마지막 전체 결과를 종합해 조언 반환
    @GetMapping("/{userId}")
    @Parameter(name="userId", description = "queryString로 userId")
    @Parameter(name="resultId", description = "queryString로 resultId")
    private ApiResult<List<String>> getTotalResult(@RequestParam Long userId, @RequestParam Long resultId){
        return ApiResult.onSuccess(resultService.getTotalResult(userId, resultId));
    }

}
