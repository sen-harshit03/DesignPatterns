package org.example.creational.singleton;

public class MultithreadedSingleton {
    private volatile static MultithreadedSingleton instance;

    private MultithreadedSingleton() {}

    public static MultithreadedSingleton getInstance() {

        if(instance == null) {
            synchronized (MultithreadedSingleton.class) {
                if(instance == null) {
                    instance = new MultithreadedSingleton();
                }
            }
        }
        return instance;
    }
}
