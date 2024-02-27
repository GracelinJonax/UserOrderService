package com.example.userorderservice.repository.service.impl;

import com.example.userorderservice.model.UserDetails;
import com.example.userorderservice.repository.UserDetailsRepository;
import com.example.userorderservice.repository.service.UserDetailsRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsRepositoryServiceImpl implements UserDetailsRepositoryService {
    public final UserDetailsRepository userDetailsRepository;

    public UserDetailsRepositoryServiceImpl(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetails findByEmail(String email) {
        return userDetailsRepository.findByEmail(email);
    }

}
