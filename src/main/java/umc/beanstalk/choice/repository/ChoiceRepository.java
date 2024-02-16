package umc.beanstalk.choice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umc.beanstalk.choice.data.domain.Choice;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
