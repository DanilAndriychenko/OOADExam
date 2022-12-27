package com.example.ooadexam.controllers;

import com.example.invoiceautomation.entities.Customer;
import com.example.invoiceautomation.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private ICustomerService CustomerService;

    @PostMapping
    public Customer registerCustomer(@RequestBody Customer customer) {
        return CustomerService.saveCustomer(customer);
    }

}
