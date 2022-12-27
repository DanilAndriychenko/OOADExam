package com.example.ooadexam.services;

import com.example.invoiceautomation.entities.Tariff;
import com.example.invoiceautomation.repositories.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TariffService implements ITariffService {

    @Autowired
    private TariffRepository TariffRepository;

    @Override
    public Tariff createTariff(Tariff tariff) {
        return TariffRepository.save(tariff);
    }

}
