package com.acmus.msscbreweryz.web.service;

import com.acmus.msscbreweryz.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Alack ones")
                .build();
    }
    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        CustomerDto.builder()
                .id(customerId)
                .build();

    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer.");

    }

}
