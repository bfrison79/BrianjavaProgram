package com.java.class15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Enter any String: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String getRev = "";


        for (int i = word.length() -1; i>=0; i--){
            getRev += word.charAt(i);


        }
        System.out.println(getRev);
    }
}
