package org.example.behavioral.state.states;

import org.example.behavioral.state.CircuitBreaker;

public class HalfOpenState extends State {

    @Override
    public void handleRequest(CircuitBreaker circuitBreaker) {
        circuitBreaker.updateWindow();
        if (circuitBreaker.getFailureCount() >= circuitBreaker.getFailureThreshold()) {
            circuitBreaker.setState(new OpenState());
        } else {
            circuitBreaker.setState(new ClosedState());
        }
    }
}
