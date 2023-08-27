package dev.diallodev.ehospitalbackend.features.user.auth;

import dev.diallodev.ehospitalbackend.features.user.UserMapper;
import dev.diallodev.ehospitalbackend.features.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;
}
