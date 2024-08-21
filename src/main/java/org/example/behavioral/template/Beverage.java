package org.example.behavioral.template;

public abstract class Beverage {
    void prepareRecipe() {
        boilWater();
        brewOrSteep();
        if (doesCustomerWantsCondiments()) { // With hooks
            addCondiments();
        }
        pourInCup();
    }

    protected abstract void brewOrSteep();
    protected abstract void addCondiments();

    protected void boilWater() {
        System.out.println("Boiling water");
    }

    protected void pourInCup() {
        System.out.println("Pouring in cup");
    }

    /**
     * Hook method:  Subclasses can override and change the behaviour.
     * @return
     */
    protected boolean doesCustomerWantsCondiments() {
        return true;
    }
}
