package org.example.behavioral.observer;

import org.example.behavioral.observer.publisher.GlassDoor;
import org.example.behavioral.observer.publisher.Indeed;
import org.example.behavioral.observer.publisher.JobPostingService;
import org.example.behavioral.observer.subscriber.ConcreteSubscriber1;
import org.example.behavioral.observer.subscriber.ConcreteSubscriber2;
import org.example.behavioral.observer.subscriber.Subscriber;


public class Main {
    public static void main(String[] args) {

        // 1. Create a publisher
        JobPostingService glassDoor = new GlassDoor();
        JobPostingService indeed = new Indeed();

        // 2. Create subscribers
        Subscriber subscriber1 = new ConcreteSubscriber1();
        Subscriber subscriber2 = new ConcreteSubscriber2();


        // Subscriber registering itself with job posting service
        subscriber1.attachToPublisher(glassDoor);
        subscriber1.attachToPublisher(indeed);
        subscriber2.attachToPublisher(indeed);


        // Job posting service, Sending notification
        glassDoor.sendNotificationOnUpdate();
        System.out.println("----------");
        indeed.sendNotificationOnUpdate();
        System.out.println("----------");

        // Unregistering subscriber 1
        subscriber1.detachToPublisher(glassDoor);
        subscriber2.detachToPublisher(indeed);

        // Send notification
        glassDoor.sendNotificationOnUpdate();
        indeed.sendNotificationOnUpdate();




    }
}
