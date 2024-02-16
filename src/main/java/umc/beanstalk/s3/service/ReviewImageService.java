package umc.beanstalk.s3.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import umc.beanstalk.s3.AmazonS3Manager;
import umc.beanstalk.s3.data.Uuid;
import umc.beanstalk.s3.repository.UuidRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReviewImageService {

    private final AmazonS3Manager s3Manager;
    private final UuidRepository uuidRepository;

    public String createImage(MultipartFile image) {

        String uuid = UUID.randomUUID().toString();
        Uuid savedUuid = uuidRepository.save(
                Uuid.builder().uuid(uuid).build());

        return s3Manager.uploadFile(s3Manager.generateReviewKeyName(savedUuid),image);
    }

}
