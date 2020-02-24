package com.flightreservation.serviceImpl;

import com.flightreservation.entity.User;
import com.flightreservation.repository.UserRepository;
import com.flightreservation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Boolean save(User user) {
        boolean result = false;
        try {
            userRepository.save(user);
            result = true;
        } catch (Exception e) {
            //TODO Need to write to log and send notificaiton
        }
        return result;
    }
}
