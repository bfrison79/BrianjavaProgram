package com.java.class08;
// Write a program to take number from user and check if it's divisible by 5 or 3

import java.util.Scanner;

public class HomeWorkDivisible {
    public static void main(String[] args) {
        System.out.println("Please enter a number that is divisible: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number that is divisible by 5");
        int num1 = sc.nextInt();

        System.out.println("Enter a number that is divisible by 3");
        int num2 = sc.nextInt();



        if(num1 % 5 == 0){
            System.out.println("Jackpot! Number is divisible by 5");
        }else if(num2 % 3 == 0){
            System.out.println("Bingo! Number is divisible by 3");
        }else{
            System.out.println("Ooops! Number not divisible");
        }


    }
}
