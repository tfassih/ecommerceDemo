package com.tfassih.ecommercedemo.controller;

import com.tfassih.ecommercedemo.dao.InvoiceDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private final InvoiceDao invoice;

    public InvoiceController(InvoiceDao invoice){
        this.invoice = invoice;
    }
}
