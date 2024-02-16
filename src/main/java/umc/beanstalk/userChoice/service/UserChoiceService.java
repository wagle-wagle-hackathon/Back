package umc.beanstalk.userChoice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.choice.repository.ChoiceRepository;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.GeneralException;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.repository.ResultRepository;
import umc.beanstalk.userChoice.data.UserChoiceConverter;
import umc.beanstalk.userChoice.data.domain.UserChoice;
import umc.beanstalk.userChoice.data.dto.UserChoiceReqDto;
import umc.beanstalk.userChoice.repository.UserChoiceRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserChoiceService {

    private final UserChoiceRepository userChoiceRepository;
    private final ResultRepository resultRepository;
    private final ChoiceRepository choiceRepository;

    @Transactional
    public UserChoice postUserChoice(UserChoiceReqDto.Post request){

        Result result = resultRepository.findById(request.getResultId()).orElseThrow(()->new GeneralException(ErrorStatus._BAD_REQUEST));
        Choice choice = choiceRepository.findById(request.getChoiceId()).orElseThrow(()->new GeneralException(ErrorStatus._BAD_REQUEST));

        UserChoice newUserChoice = UserChoiceConverter.toUserChoiceEntity(result,choice);

        return userChoiceRepository.save(newUserChoice);
    }

}
