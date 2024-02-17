package umc.beanstalk.result.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.service.ChoiceQueryService;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.GeneralException;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.RequestResultDto;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.result.repository.ResultRepository;
import umc.beanstalk.user.data.domain.User;
import umc.beanstalk.user.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultService {
    private final UserService userService;
    private final ResultRepository resultRepository;
    private final ChoiceQueryService choiceQueryService;


    public ResponseResultDto.GetTotalResult getTotalResult(Long userId, Long resultId){

        User user = userService.getUserById(userId);
        Result result = resultRepository.findById(resultId).orElseThrow(()->new GeneralException(ErrorStatus._NOT_FOUND));
        List<String> advices = choiceQueryService.getChoiceAdivcesByUserAndResultId(user, resultId);
        return ResponseResultDto.GetTotalResult.builder()
            .advices(advices)
            .name(result.getName())
            .build();
    }


    public Result postResult(RequestResultDto request){

        User user = userService.getUserById(request.getUserId());
        Result result = Result.toEntity(request,user);

        return resultRepository.save(result);
    }

}
