package umc.beanstalk.choice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.question.data.domain.Question;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
	Optional<List<Choice>> findAllByQuestionAndGender(Question question, Integer gender);
}
