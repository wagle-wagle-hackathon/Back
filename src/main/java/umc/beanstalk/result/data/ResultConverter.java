package umc.beanstalk.result.data;

import lombok.RequiredArgsConstructor;
import umc.beanstalk.result.data.domain.Result;
import umc.beanstalk.result.data.dto.FakeAnswer;
import umc.beanstalk.result.data.dto.ResponseResultDto;

import java.util.ArrayList;
import java.util.List;

public class ResultConverter {
    public static ResponseResultDto.TotalInfo totalInfo(Result result){
        List<String> fakeList = FakeAnswer.getRandomAnswer();

        return ResponseResultDto.TotalInfo.builder()
                .name(result.getName())
                .answer(result.getText())
                .fakeList(fakeList)
                .build();
    }
}
