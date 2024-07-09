package org.example.behavioral.observer.example1.subscriber;

import org.example.behavioral.observer.example1.publisher.JobPostingService;

public interface Subscriber {

    void update(String message);
    void attachToPublisher(JobPostingService service);
    void detachToPublisher(JobPostingService service);

}
