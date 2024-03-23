package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Passwordvalidator {
    @Test
    void truepasswordTest() {
        String password = "Sujitdhamke#33";
        assertTrue(PasswordCheck.passwordCheck(password));
    }
    @Test
    void falsepasswordTest() {
        assertFalse(PasswordCheck.passwordCheck("sujitdhamke")); //direct values in the parameters...
    }
}