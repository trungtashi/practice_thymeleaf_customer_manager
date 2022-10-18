package com.example.practice_thymeleaf_customer_manager.service;

import com.example.practice_thymeleaf_customer_manager.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);
}
