package umc.beanstalk.s3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.beanstalk.s3.data.Uuid;

public interface UuidRepository extends JpaRepository<Uuid,Long> {
}
