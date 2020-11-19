package com.company.ars.service;

import com.company.ars.model.customer.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Optional<Customer> getCustomerById(Long id);
    Customer findByEmail(String email);
}
