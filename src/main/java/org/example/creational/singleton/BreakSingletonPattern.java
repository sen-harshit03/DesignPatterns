package org.example.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonPattern {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        /**
         * 1. Using Class.class
         */

        LazySingleton lazySingleton1 = LazySingleton.getInstance();

        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton lazySingleton2 = constructor.newInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        /**
         * 2. Using deserialization
         */

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        outputStream.writeObject(lazySingleton1);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("abc.obj"));
        LazySingleton lazySingleton3 = (LazySingleton) inputStream.readObject();

        System.out.println(lazySingleton1 == lazySingleton3); // False

        /**
         * Using Object cloning
         */

        LazySingleton lazySingleton4 = (LazySingleton) lazySingleton1.clone();
        System.out.println(lazySingleton1 == lazySingleton4);
    }
}
