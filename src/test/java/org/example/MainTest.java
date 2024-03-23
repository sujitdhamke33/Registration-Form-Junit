package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Passwordvalidator {
    @Test
    void truepasswordTest() {
        assertTrue(PasswordCheck.passwordAllEmailCheck("abc@yahoo.com"));
        assertTrue(PasswordCheck.passwordAllEmailCheck("abc.100@yahoo.com"));
        assertTrue(PasswordCheck.passwordAllEmailCheck("abc@gmail.com.com"));


    }
    @Test
   void falsepasswordTest() {
        assertFalse(PasswordCheck.passwordAllEmailCheck("abc()*@gmail.com"));
        assertFalse(PasswordCheck.passwordAllEmailCheck(".abc123@.com"));
        assertFalse(PasswordCheck.passwordAllEmailCheck("abc..2002@gmail.com"));


    }
}