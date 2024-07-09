package org.example.behavioral.observer.example1.subscriber;

import org.example.behavioral.observer.example1.publisher.JobPostingService;

public class ConcreteSubscriber2 implements Subscriber {

    public void attachToPublisher(JobPostingService jobPostingService) {
        jobPostingService.registerForUpdate(this);
    }

    public void detachToPublisher(JobPostingService jobPostingService) {
        jobPostingService.unRegisterForUpdate(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Message for Subscriber 2 : " + message);
    }
}
