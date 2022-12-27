package com.example.ooadexam.controllers;

import com.example.invoiceautomation.entities.Invoice;
import com.example.invoiceautomation.services.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private IInvoiceService InvoiceService;

    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return InvoiceService.createInvoice(invoice);
    }

}
