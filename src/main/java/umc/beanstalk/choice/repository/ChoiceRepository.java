package umc.beanstalk.choice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.question.data.domain.Question;

public interface ChoiceRepository extends JpaRepository<Choice, Long> {
	Optional<List<Choice>> findAllByQuestionAndGender(Question question, Integer gender);

	@Query("select c from Choice as c left join UserChoice as uc on c.choiceId = uc.choice.choiceId\n" +
			"left join Result as r on r.id = uc.result.id\n" +
			"left join User as u on u.id = r.user.id\n" +
			"where u.id = :userId and r.id = :resultId")
	Optional<List<Choice>> findAllByUserIdAndResultId(@Param("userId")Long userId, @Param("resultId") Long resultId);
}
