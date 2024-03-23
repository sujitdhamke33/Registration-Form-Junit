package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactCheckedTest {
    @Test
    void trueContactTest() {
        String contact = "91 9921834355";
        assertTrue(ContactCheck.validContact(contact));
    }
    @Test
    void falseEmailTest() {
        String contact = "9921834345";
        assertFalse(ContactCheck.validContact(contact));
    }
}