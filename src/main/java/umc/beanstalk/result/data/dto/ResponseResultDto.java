package umc.beanstalk.result.data.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.result.data.domain.Result;


public class ResponseResultDto {

    @Getter
    @Builder
    public static class ResultIdDto{
        Long resultId;
    }


    @Getter
    @Builder
    public static class GetTotalResult{
        List<String> advices;
        String name;
    }

}



