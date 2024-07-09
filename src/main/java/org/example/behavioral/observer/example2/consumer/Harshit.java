package org.example.behavioral.observer.example2.consumer;

import org.example.behavioral.observer.example2.publisher.NewspaperPublisher;

public class Harshit implements Customer {

    @Override
    public void getNotification(String news) {
        System.out.println(news);
    }

    @Override
    public void registerToPublisher(NewspaperPublisher publisher) {
        publisher.registerForUpdate(this);
    }

    @Override
    public void deregisterToPublisher(NewspaperPublisher publisher) {
        publisher.deRegisterForUpdate(this);
    }
}
