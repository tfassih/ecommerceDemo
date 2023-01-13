package com.tfassih.ecommercedemo.repository;

import com.tfassih.ecommercedemo.model.InvoiceModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "invoices", path = "invoices")
public interface InvoiceRepository extends MongoRepository<InvoiceModel, String> {

}
