package org.example.behavioral.observer.example2.consumer;

import org.example.behavioral.observer.example2.publisher.NewspaperPublisher;

public interface Customer {

    void getNotification(String news);

    void registerToPublisher(NewspaperPublisher publisher);

    void deregisterToPublisher(NewspaperPublisher publisher);
}
