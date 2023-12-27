package org.example.behavioral.observer;

import org.example.behavioral.observer.publisher.GlassDoor;
import org.example.behavioral.observer.publisher.JobPostingService;
import org.example.behavioral.observer.subscriber.ConcreteSubscriber1;
import org.example.behavioral.observer.subscriber.ConcreteSubscriber2;
import org.example.behavioral.observer.subscriber.Subscriber;


public class Main {
    public static void main(String[] args) {

        // 1. Create a publisher
        JobPostingService glassDoor = new GlassDoor();

        // 2. Create subscribers
        Subscriber subscriber1 = new ConcreteSubscriber1();
        Subscriber subscriber2 = new ConcreteSubscriber2();

        subscriber1.attachToPublisher(glassDoor);
        subscriber2.attachToPublisher(glassDoor);


        // Send notification
        glassDoor.SendNotificationOnUpdate();

        // Unregistering subscriber 1
        glassDoor.unRegisterForUpdate(subscriber1);

        // Send notification
        glassDoor.SendNotificationOnUpdate();




    }
}
