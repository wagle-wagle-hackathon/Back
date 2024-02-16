package umc.beanstalk.result.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.service.ChoiceQueryService;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.RequestResultDto;
import umc.beanstalk.result.repository.ResultRepository;
import umc.beanstalk.user.data.domain.User;
import umc.beanstalk.user.service.UserService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResultService {
    private final UserService userService;
    private final ChoiceQueryService choiceQueryService;
    private final ResultRepository resultRepository;
    public List<String> getTotalResult(Long userId, Long resultId){

        User user = userService.getUserById(userId);
        List<Choice> choices = choiceQueryService.getChoicesByUserAndResultId(user, resultId);
        return choices.stream().map(Choice::getAdvice).toList();
    }

    public Result postResult(RequestResultDto request){

        User user = userService.getUserById(request.getUserId());
        Result result = Result.toEntity(request,user);

        return resultRepository.save(result);
    }

}
