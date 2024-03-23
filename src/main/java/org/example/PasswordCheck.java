package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All email test cases to satisfy the conditions given");
        String password = sc.next();

        if(passwordAllEmailCheck(password)){
            System.out.println("The password enter to test is correct " + password);
        }
        else{
            System.out.println("Entered password is invalid ");
        }

    }


    public static boolean passwordAllEmailCheck(String password){
        String regex = "^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$";
        return (Pattern.matches(regex, password));
      }
    }
