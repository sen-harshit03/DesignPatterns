package org.example.behavioral.observer.subscriber;

import org.example.behavioral.observer.publisher.JobPostingService;

public interface Subscriber {

    void update(String message);
    void attachToPublisher(JobPostingService service);
    void detachToPublisher(JobPostingService service);

}
