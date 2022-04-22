package com.java.class16;

import java.util.Scanner;

// Write a program to take one String from user and print reverse of it
public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String fun = sc.nextLine();
        String oldStr = "";


        for (int i = fun.length() -1; i>=0; i--){
            oldStr += fun.charAt(i);


        }
        System.out.println(oldStr);
        }


    }


