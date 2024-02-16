package umc.beanstalk.result.data.dto;

import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.result.data.domain.Result;

@Getter
@Builder
public class RequestResultDto {
    private String name;
    private Integer age;
    private Boolean gender;

    public static RequestResultDto toDTO(Result entity) {
        return RequestResultDto.builder()
                .name(entity.getName())
                .age(entity.getAge())
                .gender(entity.getGender())
                .build();
    }
}
