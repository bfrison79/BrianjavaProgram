package com.java.class06;

import java.util.Scanner;

public class PositiveNegativeZero {
    // Write a program that a number is positive / negative or zero

    public static void main(String[] args) {

        Scanner oatmeal = new Scanner(System.in);

        System.out.println("Please enter a number");
        int num = oatmeal.nextInt();

        if(num >= 1) System.out.println("Number is positive ");

        else if(num <= -1) System.out.println("Number is negative");

        else System.out.println("Number is zero");

    }
}




