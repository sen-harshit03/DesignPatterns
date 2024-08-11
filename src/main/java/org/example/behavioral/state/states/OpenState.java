package org.example.behavioral.state.states;

import org.example.behavioral.state.CircuitBreaker;

public class OpenState extends State {


    @Override
    public void handleRequest(CircuitBreaker circuitBreaker) {
        long currentTime = System.currentTimeMillis();

        if (circuitBreaker.getLastFailureTime() + circuitBreaker.getWaitDurationInOpenState() >= currentTime) {
            circuitBreaker.setState(new HalfOpenState());
        }
    }
}
