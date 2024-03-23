package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid 8 digit mimimum password :");
        String password = sc.next();

        if(passwordCheck(password)){
            System.out.println("Your enter password is correct " + password);
        }
        else{
            System.out.println("Entered password is invalid ");
        }

    }
    public static boolean passwordCheck(String password){
        String regex = "^.{8,}$";
        return (Pattern.matches(regex, password));
      }
    }
