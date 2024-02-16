package umc.beanstalk.Question.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umc.beanstalk.Question.data.domain.Question;

interface QuestionRepository extends JpaRepository<Question, Long> {
}
