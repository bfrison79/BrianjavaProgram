package com.java.class16;
// Write a program to take one statement from user and find out number of words
// We have inside the statement

import java.util.Scanner;

// Example input -  Hello. This is my first java String program
// Output - 8
public class StringPracticeWordCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oldStr = scan.nextLine();

        String[] parts = oldStr.split("");
        System.out.println(parts.length);



        }
    }

