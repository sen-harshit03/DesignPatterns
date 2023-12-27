package org.example.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Serializable, Cloneable {
    private static LazySingleton instance;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    public Object clone() {
        return new LazySingleton();
    }
}
