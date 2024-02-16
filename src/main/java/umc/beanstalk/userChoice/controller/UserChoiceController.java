package umc.beanstalk.userChoice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.userChoice.data.UserChoiceConverter;
import umc.beanstalk.userChoice.data.domain.UserChoice;
import umc.beanstalk.userChoice.data.dto.UserChoiceReqDto;
import umc.beanstalk.userChoice.service.UserChoiceService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-choice")
public class UserChoiceController {

    private final UserChoiceService userChoiceService;

    @PostMapping("")
    public ApiResult<?> postUserChoice(@RequestBody UserChoiceReqDto.Post request){
        UserChoice saveUserChoice = userChoiceService.postUserChoice(request);
        return ApiResult.onSuccess(UserChoiceConverter.toUserChoiceDto(saveUserChoice));
    }
}
