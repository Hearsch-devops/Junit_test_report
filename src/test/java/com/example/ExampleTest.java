package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {

    @Test
    void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void testSubtraction() {
        int result = 5 - 3;
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
