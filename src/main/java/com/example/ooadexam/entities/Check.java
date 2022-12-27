package com.example.ooadexam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Check {

    public static final int RETRIES = 5;

    @Id
    private Long Id;
    @OneToOne
    private Invoice Invoice;
    private CheckStatus Status;
    private int Retries;

    public Check(com.example.invoiceautomation.entities.Invoice invoice, CheckStatus status, int retries) {
        Invoice = invoice;
        Status = status;
        Retries = retries;
    }

    public void retry(){
        Retries++;
    }

    public boolean canRetry(){
        return Retries < RETRIES;
    }

}
