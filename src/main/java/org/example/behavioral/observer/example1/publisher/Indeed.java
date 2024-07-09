package org.example.behavioral.observer.example1.publisher;

import org.example.behavioral.observer.example1.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Indeed implements JobPostingService {

    List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void registerForUpdate(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unRegisterForUpdate(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void sendNotificationOnUpdate() {
        String message = "Hey, new job has been posted on Indeed. Please apply";
        subscriberList.forEach(subscriber -> subscriber.update(message));
    }
}
