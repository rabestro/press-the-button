package com.epam.engx;

public class ControlUnit {
    private State state = State.SHUTDOWN;

    public void powerOn() {
        state = State.MAIN_MENU;
    }

    public boolean isOperate() {
        return state != State.SHUTDOWN;
    }

    public void process(String request) {
        // will be implemented in the next sprint
    }

    public enum State {
        SHUTDOWN, MAIN_MENU, BUY_COFFEE, REFILL
    }
}
