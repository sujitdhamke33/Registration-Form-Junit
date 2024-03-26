package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class Passwordvalidator {
    String[] validEmail={ "abc@yahoo.com",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"};

    String[] InvalidEmail={"abc",
            "abc123@.com.com",
            ".abc@abc.com",
            "abc()*@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au"};





    @Test
    public void HappytestFirstName() {
        Predicate<String> validFirstname= n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
        String firstName = "Kel";
        assertTrue(validFirstname.test(firstName));
    }

    @Test
    public void SadtestfirstName() {
        String firstName = "manju";
        Predicate<String> validFirstname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
        assertFalse(validFirstname.test(firstName));
    }

    @Test
    public void HappytestlastName() {
        Predicate<String> validlastname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
        String lastname = "Cuttler";
        assertTrue(validlastname.test(lastname));
    }

    @Test
    public void SadtestlastName() {
        Predicate<String> validlastname=n -> n.matches("^[A-Z]{1}[a-zA-Z]{1,}$");
        String lastname = "ramson";
        assertFalse(validlastname.test(lastname));
    }

    @Test
    public void Happytestemail() {
        Predicate<String> Validemail=n -> n.matches("[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*");

        String email = "abc.xyz@bl.co.in";
        assertTrue(Validemail.test(email));
    }

    @Test
    public void Sadtestemail() {
        Predicate<String> Validemail=n -> n.matches("[a-z]{1,}[.][a-z]*[@][a-z]{1,}[.][a-z]*[.][a-z]*");

        String email = "cau.ju@co.in";
        assertFalse(Validemail.test(email));
    }
    @Test
    public void HappytestphoneNumber() {
        Predicate<String> validphoneNumber=n -> n.matches("^[0-9]{2}[0-9]{10}$");
        String phoneNumber = "919672740128";
        assertTrue(validphoneNumber.test(phoneNumber));
    }

    @Test
    public void SadtestphoneNumber() {
        Predicate<String> validphoneNumber=n -> n.matches("^[0-9]{2}[0-9]{10}$");
        String phoneNumber = "85708301";
        assertFalse(validphoneNumber.test(phoneNumber));
    }

    @Test
    public void HappytestPassword() {
        Predicate<String> validPassword=n -> n.matches("^[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]+[0-9]{1,}$");

        String password = "Gass@1234";
        assertTrue(validPassword.test(password));
    }

    @Test
    public void SadtestPassword() {
        Predicate<String> validPassword=n -> n.matches("^[A-Z]{1,}[A-Za-z0-9]{2,}[@_*]+[0-9]{1,}$");

        String password = "cass1234";
        assertFalse(validPassword.test(password));
    }

    @Test
    public void checkAllTestCase() {
        boolean result=PasswordCheck.passAlltestCases("Bro", "Pollard", "abc.xyz@bl.co.in", "91 9370740128", "Pass@1234");
        assertTrue(result);

    }

    @Test
    public void SadwholeTestCase()
    {
        boolean result=PasswordCheck.passAlltestCases("sanju", "samson", "abc.xyz@co.in", "9370740128", "Mass1234");
        assertFalse(result);
    }


}