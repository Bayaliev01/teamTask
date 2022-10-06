package entities;

import java.util.ArrayList;

public class DeliveryCompany {
    private String deliveryCompanyName;
    public static final int PRICE_PER_KILOGRAM = 15;
    private ArrayList<Customer> customer;
    public static final int MAX_CAPACITY_PER_CUBE_SANTI_METER = 25;

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public int getPricePerKilogram() {
        return PRICE_PER_KILOGRAM;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ArrayList<Customer> customer) {
        this.customer = customer;
    }

    public int getMaxCapacityPerSquareMeter() {
        return MAX_CAPACITY_PER_CUBE_SANTI_METER;
    }
}