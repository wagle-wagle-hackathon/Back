package umc.beanstalk.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.beanstalk.user.data.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
