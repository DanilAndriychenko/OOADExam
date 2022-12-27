package com.example.ooadexam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice {

    @Id
    private Long Id;

    private Period Period;
    private boolean Automatic;
    private Date CreationDate;

    @ManyToOne
    private Customer Customer;
    @ManyToOne
    private Tariff Tariff;

}


