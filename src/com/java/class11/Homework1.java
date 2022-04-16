package com.java.class11;

import java.util.Scanner;

//Write a program to print table of given number. If user enters 3 then print table of 3 like below
//3 6 9 12 15 18 21 24 27 30
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number 3!: ");
        int num = sc.nextInt();
        int n = 3;

        while(n <= 10){
            System.out.println(n*3);
            n++;
        }



    }

}

