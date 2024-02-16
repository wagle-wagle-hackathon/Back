package umc.beanstalk.result.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.RequestResultDto;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.result.service.ResultService;

@RestController
@RequiredArgsConstructor
@RequestMapping("result")
public class ResultController {
    private final ResultService resultService;


    @GetMapping("")
    @Operation(summary = "마지막 전체 결과를 종합해 조언 반환")
    @Parameter(name="userId", description = "queryString로 userId")
    @Parameter(name="resultId", description = "queryString로 resultId")
    private ApiResult<ResponseResultDto.GetTotalResult> getTotalResult(@RequestParam Long userId, @RequestParam Long resultId){
        return ApiResult.onSuccess(resultService.getTotalResult(userId, resultId));
    }

    @PostMapping("")
    private ApiResult<?> postResult(@RequestBody RequestResultDto request){

        Result result = resultService.postResult(request);
        return ApiResult.onSuccess(ResponseResultDto.ResultIdDto.builder()
            .resultId(result.getId())
            .build()
        );
    }

}
