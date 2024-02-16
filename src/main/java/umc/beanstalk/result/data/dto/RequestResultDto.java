package umc.beanstalk.result.data.dto;

import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.result.data.domain.Result;

@Getter
@Builder
public class RequestResultDto {
    private Long userId;
    private String name;
    private Integer age;
    private Integer gender;

    public static RequestResultDto toDTO(Result entity) {
        return RequestResultDto.builder()
                .userId(entity.getUser().getId())
                .name(entity.getName())
                .age(entity.getAge())
                .gender(entity.getGender())
                .build();
    }
}
