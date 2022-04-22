package com.java.class16;

import java.util.Scanner;

// Write a program to check given number is prime or not
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean flag = false;
        for(int i = 0; i <= num/2; i++);
        if(num % 2 == 0){
            System.out.println("This number is a prime number! ");

        }else{
            System.out.println("This number is not a prime number! ");
        }

    }
}
