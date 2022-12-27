package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Invoice;
import com.example.invoiceautomation.exceptions.InvoiceNotFoundException;
import com.example.invoiceautomation.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService implements IInvoiceService {

    @Autowired
    private InvoiceRepository InvoiceRepository;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return InvoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceById(Long id) throws InvoiceNotFoundException {
        return InvoiceRepository.findById(id).orElseThrow(InvoiceNotFoundException::new);
    }

}
