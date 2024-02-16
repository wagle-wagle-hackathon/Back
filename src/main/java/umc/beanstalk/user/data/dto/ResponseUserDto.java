package umc.beanstalk.user.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import umc.beanstalk.user.data.domain.User;
@Getter
@Builder
@AllArgsConstructor
public class ResponseUserDto {
    private Long id;
    private String name;
    private String year;

    public ResponseUserDto from(User user) {
        return ResponseUserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .year(user.getYear())
                .build();
    }
}
