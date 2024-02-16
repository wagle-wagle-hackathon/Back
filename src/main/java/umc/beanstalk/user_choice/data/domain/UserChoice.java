package umc.beanstalk.user_choice.data.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class UserChoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
