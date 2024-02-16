package umc.beanstalk.result.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.service.ChoiceQueryService;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.GeneralException;
import umc.beanstalk.result.data.ResultConverter;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.result.repository.ResultRepository;
import umc.beanstalk.user.data.domain.User;
import umc.beanstalk.user.service.UserService;
import umc.beanstalk.userChoice.data.dto.UserChoiceResDto;
import umc.beanstalk.userChoice.service.UserChoiceService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultService {
    private final UserService userService;
    private final UserChoiceService userChoiceService;
    private final ResultRepository resultRepository;
    private final ChoiceQueryService choiceQueryService;


    public List<String> getTotalResult(Long userId, Long resultId){

        User user = userService.getUserById(userId);
        List<Choice> choices = choiceQueryService.getChoicesByUserAndResultId(user, resultId);
        return choices.stream().map(Choice::getAdvice).toList();
    }

}
