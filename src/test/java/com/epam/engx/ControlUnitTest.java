package com.epam.engx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControlUnitTest {

    @Test
    void testPowerOn() {
        var controlUnit = new ControlUnit();
        controlUnit.powerOn();
        assertTrue(controlUnit.isOperate());
    }
}
