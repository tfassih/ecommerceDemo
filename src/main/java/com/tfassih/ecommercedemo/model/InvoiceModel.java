package com.tfassih.ecommercedemo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("invoices")
public class InvoiceModel {
    @Id
    private String id;
    private String status;
    private String payment;
    private String total;
    private String shipping_address;
    private String user_id;
    private String[] products;

    public InvoiceModel(String id, String status,
                        String payment, String total,
                        String shipping_address,
                        String user_id, String[] products){
        this.id = id;
        this.status = status;
        this.payment = payment;
        this.total = total;
        this.shipping_address = shipping_address;
        this.user_id = user_id;
        this.products = products;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }
}
