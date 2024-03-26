package org.example;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class PasswordCheck {

    static class FirstNameException extends Exception{
        FirstNameException(String firstname){
            super(firstname);
        }
    }
    static class LastNameException extends Exception{
        LastNameException(String lastname){
            super(lastname);
        }
    }

    static class validEmailException extends Exception{
        validEmailException(String email){
            super(email);
        }
    }
    static class contactNumberException extends Exception{
        contactNumberException(String number){
            super(number);
        }
    }

    static class validpasswordException extends Exception{
        validpasswordException(String password){
            super(password);
        }
    }

    static Predicate<String> firstNamevalid=n -> n.matches("^Cap.{2,}$");
    static Predicate<String> lastNamevalid=n -> n.matches("^Cap.{2,}$");
    static Predicate<String> validemail=n -> n.matches("^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$");
    static Predicate<String> validnumber=n -> n.matches("[0-9]{2}\\s[0-9]{10}");
    static Predicate<String> validpassword=n -> n.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-z0-9]).{8,}$");
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First name of user :");
        String name = sc.next();

        System.out.println("Enter the last name of user :");
        String lastname = sc.next();

        System.out.println("Enter Email id : ");
        String email = sc.next();

        System.out.println("Enter phone number along with country code Please ");
        String number = sc.nextLine();

        System.out.println("enter the password ");
        String password = sc.next();

        try {
            if (firstNamevalid.test(name)) {
                System.out.println(name + " Name enter is perfect ");
            } else {
                throw new FirstNameException("Enter name " + name + " is invalid so showing custom exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (lastNamevalid.test(lastname)) {
                System.out.println(lastname + " Name enter is perfect ");
            } else {
                throw new LastNameException("Enter name " + lastname + " is invalid so showing custom exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validemail.test(email)) {
                System.out.println("You entered email is correct pattern");
            } else {
                throw new validEmailException("You have entered the wrong email so please check the pattern again");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validnumber.test(number)) {
                System.out.println("Your entered number is valid...");
            } else {
                throw new contactNumberException("You entered number is wrong please check it again ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (validpassword.test(password)) {
                System.out.println("Your entered password is valid...");
            } else {
                throw new contactNumberException("You entered password is wrong please check it again ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean checkAllEmails(String[] validEmail)
    {
        String regexPattern = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        for(String emails : validEmail)
        {
            if(!Pattern.matches(regexPattern, emails))
            {
                return false;
            }
        }
        return true;

    }
    public static boolean passAlltestCases(String name,String lastName,String email,String number,String password)
    {
        if(firstNamevalid.test(name) && lastNamevalid.test(lastName) && validemail.test(email) && validnumber.test(number) && validpassword.test(password)) {
            return true;
        }
        return false;
    }
    }

