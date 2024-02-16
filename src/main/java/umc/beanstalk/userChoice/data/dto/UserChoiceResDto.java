package umc.beanstalk.userChoice.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserChoiceResDto {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UserChoiceInfo{

        private String userChoice;
        private Long resultId;
    }
}
