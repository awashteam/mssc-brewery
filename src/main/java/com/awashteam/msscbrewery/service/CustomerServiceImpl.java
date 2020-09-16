package com.awashteam.msscbrewery.service;

import com.awashteam.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerCustomerImpl implements BeerCustomer{

    @Override
    public CustomerDto getBeerCustomerId(UUID beerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .userName("Joe Buck")
                .build();
    }
}
