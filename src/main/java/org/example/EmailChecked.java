package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailChecked {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user email id address :");
        String email = sc.next();

        if(checkEmail(email)){
            System.out.println("Your enter email is correct " + email);
        }
        else{
            System.out.println("Entered email is invalid ");
        }

    }
    public static boolean checkEmail(String email){
        String regex = "^[a-zA-Z0-9]+[/.]?[a-zA-z0-9]*[@][a-z]{2,5}[/.][a-z]{2,3}[/.]?[a-z]*$";
        return Pattern.matches(regex,email);

    }

}