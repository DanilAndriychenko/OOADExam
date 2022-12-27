package com.example.ooadexam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tariff {

    @Id
    private Long Id;
    private String Name;
    private Float Price;

    @OneToMany
    private Set<Invoice> Invoices;

}