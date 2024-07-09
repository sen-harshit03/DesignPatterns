package org.example.behavioral.observer.example1;

import org.example.behavioral.observer.example1.publisher.GlassDoor;
import org.example.behavioral.observer.example1.publisher.Indeed;
import org.example.behavioral.observer.example1.publisher.JobPostingService;
import org.example.behavioral.observer.example1.subscriber.ConcreteSubscriber1;
import org.example.behavioral.observer.example1.subscriber.ConcreteSubscriber2;
import org.example.behavioral.observer.example1.subscriber.Subscriber;

/**
 * The observer pattern defines oneTomany relationship between object such that if one object change its state,
 * all of its dependent are informed about this change.
 */
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
