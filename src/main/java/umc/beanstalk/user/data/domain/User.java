package umc.beanstalk.user.data.domain;

import lombok.*;
import umc.beanstalk.user.data.dto.RequestUserDto;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Builder

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성
    private Long id;
    @Column
    private String name;
    @Column
    private String year;

    public User toDto(RequestUserDto dto) {
        return User.builder()
                .name(dto.getName())
                .year(dto.getYear())
                .build();
    }

}
