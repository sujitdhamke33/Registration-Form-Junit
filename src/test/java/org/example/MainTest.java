package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Passwordvalidator {
    @Test
    void trueContactTest() {
        String password = "Sujitdhamke33";
        assertTrue(PasswordCheck.passwordCheck(password));
    }
    @Test
    void falseEmailTest() {
        assertFalse(PasswordCheck.passwordCheck("sujitdhamke")); //direct values in the parameters...
    }
}