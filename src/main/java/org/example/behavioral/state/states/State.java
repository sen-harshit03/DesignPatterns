package org.example.behavioral.state.states;

import org.example.behavioral.state.CircuitBreaker;

/**
 * The State Pattern allows an object to alter its behavior
 * when its internal state changes.
 */
public abstract class State {

    public abstract void handleRequest(CircuitBreaker circuitBreaker);
}
