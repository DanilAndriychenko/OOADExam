package com.example.ooadexam.repositories;

import com.example.invoiceautomation.entities.Tariff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TariffRepository extends CrudRepository<Tariff, Long> {

}
