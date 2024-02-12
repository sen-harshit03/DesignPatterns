package org.example.behavioral.observer.publisher;

import org.example.behavioral.observer.subscriber.Subscriber;

public interface JobPostingService {

    void registerForUpdate(Subscriber subscriber);
    void unRegisterForUpdate(Subscriber subscriber);
    void sendNotificationOnUpdate();
}
