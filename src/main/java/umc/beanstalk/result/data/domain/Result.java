package umc.beanstalk.result.data.domain;

import lombok.*;
import umc.beanstalk.result.data.dto.RequestResultDto;
import umc.beanstalk.user.data.domain.User;
import umc.beanstalk.user.data.domain.User;

import javax.persistence.*;
import java.util.List;

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
    private Boolean gender;
    @Column
    private String text;
    @Column
    private String image;

    public Result toEntity(RequestResultDto dto) {
        return Result.builder()
                .name(dto.getName())
                .age(dto.getAge())
                .gender(dto.getGender())
                .build();
    }
}