package umc.beanstalk.userChoice.data.dto;

import lombok.Getter;

public class UserChoiceReqDto {

    @Getter
    public static class Post{
        Long resultId;
        Long choiceId;
    }
}
