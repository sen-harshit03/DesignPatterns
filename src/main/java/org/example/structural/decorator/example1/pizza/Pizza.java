package org.example.structural.decorator.example1.pizza;

public abstract class Pizza {
    String description = "Unknown Pizza";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
