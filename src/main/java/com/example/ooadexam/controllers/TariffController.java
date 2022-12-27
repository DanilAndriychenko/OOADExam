package com.example.ooadexam.controllers;

import com.example.invoiceautomation.entities.Tariff;
import com.example.invoiceautomation.services.ITariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tariffs")
public class TariffController {

    @Autowired
    private ITariffService TariffService;

    @PostMapping
    public Tariff createTariff(@RequestBody Tariff tariff) {
        return TariffService.createTariff(tariff);
    }

}
