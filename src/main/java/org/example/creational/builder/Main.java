package org.example.creational.builder;

public class Main {
    public static void main(String[] args) {

//        House house = new House.Builder()
//                .rooms()

        House h3 = House.builder()
                .rooms(3)
                .kitchen(2)
                .bathroom(2)
                .build();
    }
}
