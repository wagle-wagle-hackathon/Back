package umc.beanstalk.result.data.domain;

import lombok.*;
import umc.beanstalk.result.data.dto.ResponseResultDto;
import umc.beanstalk.user.data.entity.User;

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
    @JoinColumn(name="UserId")
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
/*
    public ResponseResultDto toDto() {
        return new ResponseResultDto(name, age, text, image);
    }

 */
}