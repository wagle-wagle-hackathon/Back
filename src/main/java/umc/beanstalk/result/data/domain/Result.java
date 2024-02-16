package umc.beanstalk.result.data.domain;

import lombok.*;
import umc.beanstalk.result.data.dto.RequestResultDto;
import umc.beanstalk.user.data.domain.User;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
@Builder
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 id 자동 생성
    private Long id;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private Integer gender;
    @Column
    private String image;

    public static Result toEntity(RequestResultDto dto, User user) {
        return Result.builder()
                .user(user)
                .name(dto.getName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .build();
    }
}