package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmailCheckedTest {
//FirstName firstName = new FirstName();
    @Test
    void trueEmailTest() {
        String email = "sujit.dhamke12@gmail.com";
        assertTrue(EmailChecked.checkEmail(email));
    }
    @Test
    void falseEmailTest() {
        String email = "raj3@gmaildk";
        assertFalse(EmailChecked.checkEmail(email));
    }
}