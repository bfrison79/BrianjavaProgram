package com.java.class16;

// Write a program to take one String from user and print
// Occurrence of given char in String

//Input - This is my java program!
// output - 3

import java.util.Locale;

public class FindOccurenceOfChar {
    public static void main(String[] args) {
        String str = "This is my java program! ";
        char b = 'a';

        int word = 0;
        for(int i =0; i < str.length(); i++){
            if(str.toLowerCase().charAt(i) == 'a'){
                word++;
            }
        }
        System.out.println(word);
    }
}
