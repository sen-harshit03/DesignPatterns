package org.example.behavioral.template;

/**
 * Template method pattern defines the algorithm with steps.
 *  and allow subclasses to provide implementation for one or more steps.
 */
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
