package umc.beanstalk.userChoice.data;

import umc.beanstalk.choice.data.domain.Choice;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.userChoice.data.domain.UserChoice;
import umc.beanstalk.userChoice.data.dto.UserChoiceResDto;

public class UserChoiceConverter {

    public static UserChoice toUserChoiceEntity(Result result, Choice choice){

        return UserChoice.builder()
                .choice(choice)
                .result(result)
                .build();
    }

    public static UserChoiceResDto.UserChoiceInfo toUserChoiceDto(UserChoice userChoice){

        return UserChoiceResDto.UserChoiceInfo.builder()
                .resultId(userChoice.getResult().getId())
                .userChoice(userChoice.getChoice().getCText())
                .build();
    }
}
