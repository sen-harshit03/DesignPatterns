package org.example.behavioral.observer.example1.publisher;

import org.example.behavioral.observer.example1.subscriber.Subscriber;

public interface JobPostingService {

    void registerForUpdate(Subscriber subscriber);
    void unRegisterForUpdate(Subscriber subscriber);
    void sendNotificationOnUpdate();
}
