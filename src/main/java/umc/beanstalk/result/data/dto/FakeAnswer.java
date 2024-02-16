package umc.beanstalk.result.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Getter
@NoArgsConstructor
public class FakeAnswer {
    static String[] arr = new String[] {
            "apple",
            "grape",
            "banana",
            "kiwi",
            "1",
            "2",
            "3",
            "4",
            "6",
            "5",
            "7",
            "8",
            "67",
            "354",
            "25",
            "14",
            "23",
            "123",
            "124",
            "234"
    };



    public static List<String> getRandomAnswer(){
        List<String> baseFakeList = new ArrayList<>(Arrays.asList(arr));
        List<String> fakeList = new ArrayList<>();
        Collections.shuffle(baseFakeList);
        for(int i=0; i<3; i++){
            String answer = baseFakeList.remove(0);
            fakeList.add(answer);
        }

        return fakeList;
    }

}
