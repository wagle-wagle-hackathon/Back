package umc.beanstalk.s3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import umc.beanstalk.s3.service.ReviewImageService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/image")
public class ImageController {

    private final ReviewImageService reviewImageService;
    @PostMapping(value = "/review",consumes = "multipart/form-data")
    public String postReviewImage(@RequestPart MultipartFile image){
        return reviewImageService.createImage(image);
    }
}
