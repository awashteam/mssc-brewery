package com.awashteam.msscbrewery.service;

import com.awashteam.msscbrewery.web.model.BeerDto;
import com.awashteam.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface BeerCustomer {
    CustomerDto getBeerCustomerId(UUID beerId);
}
