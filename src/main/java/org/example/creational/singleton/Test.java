package org.example.creational.singleton;

public class Test {
    public static void main(String[] args) {
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1 == lazySingleton2);

        EagerSingleTon eagerSingleTon1 = EagerSingleTon.getInstance();
        EagerSingleTon eagerSingleTon2 = EagerSingleTon.getInstance();
        System.out.println(eagerSingleTon1 == eagerSingleTon2);

        MultithreadedSingleton multithreadedSingleton1 = MultithreadedSingleton.getInstance();
        MultithreadedSingleton multithreadedSingleton2 = MultithreadedSingleton.getInstance();
        System.out.println(multithreadedSingleton1 == multithreadedSingleton2);




    }
}
