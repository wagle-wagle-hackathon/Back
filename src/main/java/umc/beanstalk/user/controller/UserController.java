package umc.beanstalk.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.beanstalk.common.apiPayload.ApiResult;
import umc.beanstalk.user.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public ApiResult<?> login(@PathVariable Long userId){
        // 결과 응답
        return ApiResult.onSuccess(userService.login(userId));
    }
}
