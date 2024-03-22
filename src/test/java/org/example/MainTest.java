package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastNameTest {
//FirstName firstName = new FirstName();
    @Test
    void lastNameHappyTest() {
        String name = "Captain";
        assertTrue(LastName.checkLastName(name));
    }
    @Test
    void lastNameSadTest() {
        String name = "captain";
        assertFalse(LastName.checkLastName(name));
    }
}