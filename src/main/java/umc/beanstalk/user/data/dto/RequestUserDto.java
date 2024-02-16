package umc.beanstalk.user.data.dto;

import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.user.data.domain.User;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class RequestUserDto {

    private String name;
    private String year;

    public static RequestUserDto fromDto(User user) {
        return RequestUserDto.builder()
                .name(user.getName())
                .year(user.getYear())
                .build();
    }
}
