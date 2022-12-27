package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Check;
import org.springframework.stereotype.Service;

@Service
public class CheckPaymentService implements ICheckPaymentService {

    @Override
    public boolean payCheck(Check check) {
        //logic to pay the check on specific platform
        return true;
    }

}
