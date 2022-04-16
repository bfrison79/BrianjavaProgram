package com.java.homework;

import java.util.Locale;
import java.util.Scanner;

public class Poliadrome {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter in a String to see if it's a Poliadrome!; ");
        String str = sc.nextLine();
        String strReverse = "";

        for (int i = str.length() -1; i>=0; i--){
            strReverse += str.toLowerCase(Locale.ROOT).charAt(i);

        }
        System.out.println(strReverse);

       if (str.equalsIgnoreCase(strReverse)){
           System.out.println("String is a Poliadrome");
       }else{
           System.out.println("String is not a Poliadrome");
       }
    }
}
