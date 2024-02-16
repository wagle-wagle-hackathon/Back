package umc.beanstalk.result.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;


public class ResponseResultDto {

    @Getter
    @Builder
    @AllArgsConstructor
    public static class TotalInfo {
        private String name;
        private String answer;
        private String image;
        private List<String> fakeList;
    }
}



