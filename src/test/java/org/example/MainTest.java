package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNameTest {
//FirstName firstName = new FirstName();
    @Test
    void firstNameHappyTest() {
        String name = "Captain";
        assertTrue(FirstName.checkfirstname(name));
    }
    @Test
    void firstNameSadTest() {
        String name = "captain";
        assertFalse(FirstName.checkfirstname(name));
    }
}