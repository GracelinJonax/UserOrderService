package com.example.userorderservice.repository.service.impl;

import com.example.userorderservice.model.TenantDetails;
import com.example.userorderservice.repository.TenantDetailsRepository;
import com.example.userorderservice.repository.service.TenantDetailsRepositoryService;
import org.springframework.stereotype.Service;

@Service
public class TenantDetailsRepositoryServiceImpl implements TenantDetailsRepositoryService {
    private final TenantDetailsRepository tenantDetailsRepository;

    public TenantDetailsRepositoryServiceImpl(TenantDetailsRepository tenantDetailsRepository) {
        this.tenantDetailsRepository = tenantDetailsRepository;
    }

    @Override
    public TenantDetails findByEmail(String email) {
        return tenantDetailsRepository.findByEmail(email);
    }

}
