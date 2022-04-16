package com.java.class11;

import java.util.Scanner;

//Write a program to print numbers that are not divislbe by 3 and divisible by 7
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number below! ");
        int num = sc.nextInt();
        int t = 1;
        while (t <= num) {
            if(t % 3 != 0) {
                System.out.println(t);
            }t++;

            if(t % 7 == 0){
                System.out.println(t);

            }t++;

        }

    }

}

