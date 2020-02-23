package com.flightreservation.serviceImpl;

import com.flightreservation.repository.UserRepository;
import com.flightreservation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
