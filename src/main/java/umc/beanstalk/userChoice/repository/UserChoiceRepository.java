package umc.beanstalk.userChoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.beanstalk.userChoice.data.domain.UserChoice;

public interface UserChoiceRepository extends JpaRepository<UserChoice,Long> {
}
