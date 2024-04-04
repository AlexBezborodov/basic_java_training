package com.intensive.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WordWrapTest {
    @Test
    @DisplayName("Check length of the first word in the line")
    void testWrap() throws TooShortLengthException {
        assertEquals("Hello\nworld", WordWrap.wrap("Hello world", 5));
        assertEquals("Hellow\norld", WordWrap.wrap("Hellow orld", 6));
        assertEquals("Helloworld", WordWrap.wrap("Helloworld", 12));
        assertEquals("", WordWrap.wrap("", 1));
    }

    @DisplayName("Check to short length exception")
    @Test
    void testWrapThrowsException() {
        assertThrows(TooShortLengthException.class, () -> WordWrap.wrap("Hello world", 2));
    }
}
