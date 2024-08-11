package org.example.behavioral.state;

import lombok.Getter;
import lombok.Setter;
import org.example.behavioral.state.states.ClosedState;
import org.example.behavioral.state.states.State;

public class CircuitBreaker {
    @Getter @Setter
    private final long waitDurationInOpenState;
    private final int[] window;
    private final int slidingWindowSize;
    private int start;
    private int end;
    private int failureCount;
    private final int failureThreshold;
    @Setter @Getter
    private long lastFailureTime;

    @Setter
    private State state;

    public CircuitBreaker(int slidingWindowSize, int failureThreshold, long waitDurationInOpenState) {
        this.slidingWindowSize = slidingWindowSize;
        this.window = new int[slidingWindowSize];
        this.waitDurationInOpenState = waitDurationInOpenState;
        this.failureThreshold = failureThreshold;
        this.state = new ClosedState();
    }

    public void handleRequest() {
        state.handleRequest(this);
    }

    public void updateWindow() {  // status = 1 for success and -1 for failure
        int status = getResponseStatus();
        if (status == 1) {
            window[end] = 1;
        } else {
            window[end] = -1;
            failureCount++;
        }

        end = (end + 1) % slidingWindowSize;

        if (end == start) {  // window size exceeded so move slow by one
            if (window[start] == -1) {
                failureCount--;
            }
            start = (start + 1) % slidingWindowSize;
        }
    }

    private int getResponseStatus() {
        if (Math.random() > 0.7) {
            return 1;
        }
        return -1;
    }

    public void resetFailures() {
        failureCount = 0;
    }

    public void incrementFailures() {
        this.failureCount++;
    }

    public int getFailureCount() {
        return failureCount;
    }

    public int getFailureThreshold() {
        return failureThreshold;
    }
}
