package org.example.behavioral.strategy.without;

public class Main {
    public static void main(String[] args) {

        SuperHero superHero = new IronMan();
        superHero.fly();
        superHero.heal();

        superHero = new Groot();
        superHero.attack();

    }
}
