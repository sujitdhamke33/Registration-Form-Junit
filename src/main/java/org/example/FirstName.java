package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FirstName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user Name to check :");
        String name = sc.next();

        if(checkfirstname(name)){
            System.out.println("name enter is correct " + name);
        }
        else{
            System.out.println("name is invalid ");
        }

    }
    public static boolean checkfirstname(String name){
        String regex = "^Cap.{2,}$";
        return Pattern.matches(regex,name);

    }

}