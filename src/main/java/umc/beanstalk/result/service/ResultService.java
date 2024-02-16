package umc.beanstalk.result.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.GeneralException;
import umc.beanstalk.result.data.ResultConverter;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.result.repository.ResultRepository;

@Service
@RequiredArgsConstructor
public class ResultService {
    private final ResultRepository resultRepository;

    public ResponseResultDto.TotalInfo show(Long resultId) {
        Result result = resultRepository.findById(resultId).orElseThrow(()->new GeneralException(ErrorStatus._NOT_FOUND));
        return ResultConverter.totalInfo(result);
    }

}
