package org.example.behavioral.observer.example2.publisher;

import org.example.behavioral.observer.example2.consumer.Customer;

public interface NewspaperPublisher {

    void registerForUpdate(Customer customer);

    void deRegisterForUpdate(Customer customer);

    void updateCustomers();
}
