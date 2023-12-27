package org.example.behavioral.strategy.with;

import org.example.behavioral.strategy.with.heros.Groot;
import org.example.behavioral.strategy.with.heros.SuperHero;
import org.example.behavioral.strategy.with.heros.Thor;

public class Main {


    public static void main(String[] args) {
        SuperHero superHero = new Thor();
        superHero.setAttackingStrategy();
        superHero.setHealingStrategy();

        superHero = new Groot();
        superHero.setHealingStrategy();
    }
}
