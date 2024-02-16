package umc.beanstalk.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umc.beanstalk.question.data.domain.Question;

interface QuestionRepository extends JpaRepository<Question, Long> {
}
