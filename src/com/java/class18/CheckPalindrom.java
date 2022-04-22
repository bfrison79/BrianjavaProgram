package com.java.class18;

import java.util.Scanner;

// Write a program to check given String is palindrome or not
public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Taking input from user
        String str = sc.nextLine();


        String rev = (str);

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");


        }


    }
}