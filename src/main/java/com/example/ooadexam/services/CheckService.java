package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Check;
import com.example.invoiceautomation.entities.CheckStatus;
import com.example.invoiceautomation.entities.Customer;
import com.example.invoiceautomation.entities.Invoice;
import com.example.invoiceautomation.exceptions.CustomerBlockedException;
import com.example.invoiceautomation.exceptions.InvoiceNotFoundException;
import com.example.invoiceautomation.repositories.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService implements ICheckService {

    @Autowired
    private IInvoiceService InvoiceService;
    @Autowired
    private ICustomerService CustomerService;
    @Autowired
    private CheckRepository CheckRepository;
    @Autowired
    private ICheckPaymentService CheckPaymentService;

    @Override
    public Check payCheck(Long id) throws CustomerBlockedException, InvoiceNotFoundException {
        Invoice invoice = InvoiceService.getInvoiceById(id);
        if(invoice.getCustomer().isBlocked())
            throw new CustomerBlockedException();
        Check check = CheckRepository.save(new Check(invoice, CheckStatus.INITIAL, 0));
        if (check.getInvoice().isAutomatic() && check.getStatus() == CheckStatus.INITIAL) {
            check = payCheck(check);
        }
        return check;
    }

    private Check payCheck(Check check) {
        if(check.canRetry()) {
            if(CheckPaymentService.payCheck(check)) {
                check.setStatus(CheckStatus.SUCCESSFUL);
            } else {
                check.retry();
                //schedule payCheck(check) method call in 24 hours
            }
        } else {
            check.setStatus(CheckStatus.FAILED);
            Customer customer = check.getInvoice().getCustomer();
            customer.setBlocked(true);
            CustomerService.saveCustomer(customer);
        }
        check = CheckRepository.save(check);
        return check;
    }

}
