package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactCheckedTest {
    @Test
    void trueContactTest() {
        String password = "Sujitdhamke33";
        assertTrue(ContactCheck.passwordCheck(password));
    }
    @Test
    void falseEmailTest() {
        assertFalse(ContactCheck.passwordCheck("sujitdhamke33")); //direct values in the parameters...
    }
}