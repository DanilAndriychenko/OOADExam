package com.example.ooadexam.controllers;

import com.example.invoiceautomation.entities.Check;
import com.example.invoiceautomation.services.ICheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checks")
public class CheckController {

    @Autowired
    private ICheckService CheckService;

    @PostMapping("/{id}")
    public Check payCheck(@PathVariable(value = "id") Long id) throws Exception {
        return CheckService.payCheck(id);
    }

}
