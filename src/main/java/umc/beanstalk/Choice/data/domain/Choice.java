package umc.beanstalk.Choice.data.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.beanstalk.Question.data.domain.Question;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Choice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long choiceId;

	private String cText;

	private String image;

	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;
}
