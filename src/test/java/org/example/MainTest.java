package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Passwordvalidator {
    @Test
    public void checkfirstnametrue() {
        assertTrue(PasswordCheck.firstNamevalid("Captain"));
        assertFalse(PasswordCheck.firstNamevalid("Sujit"));

    }

    @Test
    public void checklastnamefalse() {
        assertTrue(PasswordCheck.lastNamevalid("Captain"));
        assertFalse(PasswordCheck.lastNamevalid("Sujit"));
    }

    @Test
    public void checkemail() {
        assertTrue(PasswordCheck.validemail("abc@yahoo.com"));
        assertTrue(PasswordCheck.validemail("abc.100@yahoo.com"));
        assertTrue(PasswordCheck.validemail("abc@gmail.com.com"));
        assertFalse(PasswordCheck.validemail("abc()*@gmail.com"));

    }

    @Test
    public void checknumber() {
        assertTrue(PasswordCheck.validnumber("91 9082164605"));
        assertFalse(PasswordCheck.validnumber("9082164605"));
    }

    @Test
    public void checkpassword() {
        assertTrue(PasswordCheck.validpassword("Sujitdhamke12@gmail.com"));
        assertFalse(PasswordCheck.validpassword("sujit"));
    }
}