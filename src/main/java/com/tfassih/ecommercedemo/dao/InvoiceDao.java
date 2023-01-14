package com.tfassih.ecommercedemo.dao;

import com.tfassih.ecommercedemo.model.InvoiceModel;
import com.tfassih.ecommercedemo.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@EnableMongoRepositories
public class InvoiceDao {
    @Autowired
    InvoiceRepository invoiceRepo;

    public List<InvoiceModel> getAllInvoices(){
        return invoiceRepo.findAll();
    }
}
