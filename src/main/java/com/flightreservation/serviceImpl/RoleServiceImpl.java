package com.flightreservation.serviceImpl;

import com.flightreservation.repository.RoleRepository;
import com.flightreservation.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements UserService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
}
