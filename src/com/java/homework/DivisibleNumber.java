package com.java.homework;

import java.util.Scanner;

public class DivisibleNumber {
    //Write a java program to check given number is divided by 5 or not

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to see if it is divisible by 5");
        int div5 = sc.nextInt();
        if(div5 % 5 == 0) {
            System.out.println(div5 + " is divisible by 5");
        }else{
            System.out.println(div5 + " is not divisible by 5");
        }

    }
}
