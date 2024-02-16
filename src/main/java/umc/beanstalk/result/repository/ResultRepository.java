package umc.beanstalk.result.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.beanstalk.result.data.domain.Result;

public interface ResultRepository extends JpaRepository<Result, Long> {
}
