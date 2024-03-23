package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER VALID MOBILE NUMBER :");
        String number = sc.next();

        if(validContact(number)){
            System.out.println("Your enter number is correct " + number);
        }
        else{
            System.out.println("Entered number is invalid ");
        }

    }
    public static boolean validContact(String number) {
        String regex = "[0-9]{2}\\s[0-9]{10}";

        return (Pattern.matches(regex, number));

        }
    }
