package com.entities;

import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    public final static  double PRICE_PER_KILLOGRAM  = 12.0;
    private List<Customer> customers;
    public final static  double MAX_CAPACITY_PER_CUBE_SENTYMETR = 10.0;

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", customers=" + customers +
                '}';
    }
}
