package umc.beanstalk.userChoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.userChoice.data.domain.UserChoice;
import java.util.List;

public interface UserChoiceRepository extends JpaRepository<UserChoice,Long> {

    List<UserChoice> findAllByResult(Result result);
}
