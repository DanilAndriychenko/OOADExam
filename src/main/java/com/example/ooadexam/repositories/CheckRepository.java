package com.example.ooadexam.repositories;

import com.example.invoiceautomation.entities.Check;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends CrudRepository<Check, Long> {

}
