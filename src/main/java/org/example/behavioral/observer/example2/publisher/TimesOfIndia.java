package org.example.behavioral.observer.example2.publisher;

import org.example.behavioral.observer.example2.consumer.Customer;

import java.util.ArrayList;
import java.util.List;

public class TimesOfIndia implements NewspaperPublisher {

    private final List<Customer> customers = new ArrayList<>();


    @Override
    public void registerForUpdate(Customer customer) {
        this.customers.add(customer);
    }

    @Override
    public void deRegisterForUpdate(Customer customer) {
        this.customers.remove(customer);
    }

    @Override
    public void updateCustomers() {
        customers.forEach(customer -> customer.getNotification("A new news"));
    }
}
