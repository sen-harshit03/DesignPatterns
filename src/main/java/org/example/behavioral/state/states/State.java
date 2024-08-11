package org.example.behavioral.state.states;

import org.example.behavioral.state.CircuitBreaker;

public abstract class State {


    public abstract void handleRequest(CircuitBreaker circuitBreaker);
}
