package com.example.demo.services;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private DivisionRepository divisionRepository;

    public Customer saveCustomer(Customer customer, Long divisionId) {
        Division division = divisionRepository.findById(divisionId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid division ID"));
        customer.setDivision(division);
        return customerRepository.save(customer);
    }
}

