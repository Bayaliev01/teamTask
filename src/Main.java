import Service.DeliveryCompanyService;
import com.entities.Customer;
import com.entities.DeliveryCompany;
import com.entities.Load;
import com.entities.Order;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Load load = new Load(5.0,7.0,15);
        Load load1 = new Load(6.0,6.0,20);
        Load load2 = new Load(7.0,5.0,30);

        Order order = new Order(load);
        Order order1 = new Order(load1);

        System.out.println(order.getOrderFee());
        System.out.println(order1.getOrderFee());

        Customer customer = new Customer("cust1",order);
        Customer customer1 = new Customer("cust2",order1);
        customer.addOrder(order1);
        List<Customer>customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer1);
        customer.addOrder(order1);

        DeliveryCompany deliveryCompany = new DeliveryCompany("comp7");
        deliveryCompany.setCustomers(customers);

        List<DeliveryCompany>deliveryCompanies=new ArrayList<>();
        deliveryCompanies.add(deliveryCompany);
        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService(deliveryCompanies);

        System.out.println(deliveryCompanyService.getTotalFee("cust1"));
        deliveryCompanyService.acceptOrder(0,order1,0);
        System.out.println(deliveryCompanyService.getCompanyProfit("comp7"));

        System.out.println(deliveryCompanies.size());
        deliveryCompanyService.createDeliveryCompany();
    }

}