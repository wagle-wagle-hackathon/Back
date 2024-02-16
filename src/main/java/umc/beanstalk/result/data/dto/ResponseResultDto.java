package umc.beanstalk.result.data.dto;

import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.result.data.domain.Result;

@Getter
@Builder
public class ResponseResultDto {
    Long resultId;
    public static ResponseResultDto toDTO(Result entity) {
        return ResponseResultDto.builder().resultId(entity.getId()).build();
    }
}



