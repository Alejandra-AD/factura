package com.curso.di.factura.factura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.di.factura.factura.models.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public Invoice showInvoice(){
        return invoice;
    }

}
