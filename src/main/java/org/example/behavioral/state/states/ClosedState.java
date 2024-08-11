package org.example.behavioral.state.states;

import org.example.behavioral.state.CircuitBreaker;

import java.util.Random;

public class ClosedState extends State {

    @Override
    public void handleRequest(CircuitBreaker circuitBreaker) {
        circuitBreaker.updateWindow();
        if (circuitBreaker.getFailureCount() >= circuitBreaker.getFailureThreshold()) {
            circuitBreaker.setState(new OpenState());
        }
    }
}
