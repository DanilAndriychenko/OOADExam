package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Invoice;
import com.example.invoiceautomation.exceptions.InvoiceNotFoundException;

public interface IInvoiceService {

    Invoice createInvoice(Invoice invoice);
    Invoice getInvoiceById(Long id) throws InvoiceNotFoundException;

}
