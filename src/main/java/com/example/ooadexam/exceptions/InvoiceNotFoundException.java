package com.example.ooadexam.exceptions;

public class InvoiceNotFoundException extends Exception{

    public InvoiceNotFoundException() {
        super("Invoice not found!");
    }
}
