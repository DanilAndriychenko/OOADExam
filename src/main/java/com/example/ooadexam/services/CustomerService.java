package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Customer;
import com.example.invoiceautomation.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository CustomerRepository;

    @Override
    public Customer saveCustomer(Customer user) {
        return CustomerRepository.save(user);
    }

}
