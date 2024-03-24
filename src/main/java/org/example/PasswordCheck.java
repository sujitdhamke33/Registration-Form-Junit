package org.example;

import java.util.Scanner;
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
            if (firstNamevalid(name)) {
                System.out.println(name + " Name enter is perfect ");
            } else {
                throw new FirstNameException("Enter name " + name + " is invalid so showing custom exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            if (lastNamevalid(lastname)) {
                System.out.println(lastname + " Name enter is perfect ");
            } else {
                throw new LastNameException("Enter name " + lastname + " is invalid so showing custom exception");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            if(validemail(email)){
                System.out.println("You entered email is correct pattern");
            }else{
                throw new validEmailException("You have entered the wrong email so please check the pattern again");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            if(validnumber(number)){
                System.out.println("Your entered number is valid...");
            }else{
                throw new contactNumberException("You entered number is wrong please check it again ");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            if(validpassword(password)){
                System.out.println("Your entered password is valid...");
            }else{
                throw new contactNumberException("You entered password is wrong please check it again ");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static boolean firstNamevalid(String name) {
        String regex = "^Cap.{2,}$";
        return Pattern.matches(regex, name);
    }

    public static boolean lastNamevalid(String name) {
        String regex = "^Cap.{2,}$";
        return Pattern.matches(regex, name);
    }

    public static boolean validemail(String email){
        String regex = "^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$";
        return Pattern.matches(regex,email);
    }
    public static boolean validnumber(String number){
        String regex = "[0-9]{2}\\s[0-9]{10}";
        return Pattern.matches(regex, number);
    }
    public static boolean validpassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-z0-9]).{8,}$";
        return Pattern.matches(regex,password);
    }
}
