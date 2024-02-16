package umc.beanstalk.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.beanstalk.common.apiPayload.code.status.ErrorStatus;
import umc.beanstalk.common.apiPayload.exception.GeneralException;
import umc.beanstalk.user.data.domain.User;
import umc.beanstalk.user.data.dto.RequestUserDto;
import umc.beanstalk.user.repository.UserRepository;

import javax.transaction.Transactional;


import static umc.beanstalk.user.data.dto.RequestUserDto.fromDto;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    public RequestUserDto login(Long userId) {

        User target = userRepository.findById(userId).orElseThrow(()->new GeneralException(ErrorStatus._NOT_FOUND));
        return fromDto(target);
    }
}
