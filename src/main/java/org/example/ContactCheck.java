package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid 8 digit mimimum password with one Uppercase:");
        String password = sc.next();

        if(passwordCheck(password)){
            System.out.println("Your enter password is correct " + password);
        }
        else{
            System.out.println("Entered password is invalid ");
        }

    }
    public static boolean passwordCheck(String password){
        String regex = "^(?=.*[A-Z]).{8,}$"; //?= positive condition that shows there must be one uppercase ignore by regex
        return (Pattern.matches(regex, password));
      }
    }
