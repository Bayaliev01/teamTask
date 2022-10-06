package com.entities;

public class DeliveryCompany {
    private String deliveryCompanyName;
    public final static  double PRICE_PER_KILLOGRAM  = 12.0;
    private String customers;
    public final static  double MAX_CAPACITY_PER_CUBE_SENTYMETR = 10.0;

    public DeliveryCompany(String deliveryCompanyName, String customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "DeliveryCompany{" +
                "deliveryCompanyName='" + deliveryCompanyName + '\'' +
                ", customers='" + customers + '\'' +
                '}';
}
}
