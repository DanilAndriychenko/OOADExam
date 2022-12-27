package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Check;
import com.example.invoiceautomation.exceptions.CustomerBlockedException;
import com.example.invoiceautomation.exceptions.InvoiceNotFoundException;

public interface ICheckService {

    Check payCheck(Long id) throws CustomerBlockedException, InvoiceNotFoundException;

}
