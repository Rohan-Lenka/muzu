package com.muzu.backend.service.utils;

import com.muzu.backend.entity.User;
import com.muzu.backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceUtils {

    private final UserRepository userRepository;

    public User getUserById(String userId) {
        return userRepository
                .findById(userId)
                .orElseThrow(
                        () -> new IllegalArgumentException("User with user id: " + userId + " does not exist")
                );
    }

}
