package org.example.behavioral.observer.subscriber;

import org.example.behavioral.observer.publisher.JobPostingService;

public class ConcreteSubscriber2 implements Subscriber {

    //    @Autowired
    private JobPostingService jobPostingService;

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
