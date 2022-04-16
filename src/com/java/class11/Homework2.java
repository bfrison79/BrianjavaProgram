package com.java.class11;

import java.util.Scanner;

//  Write a program to print numbers that are divisible by 3 and 5 from 1 to 50
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number amount below!: ");
        int num = sc.nextInt();
        int b = 1;
        while(b <= num){
            if(b%3 == 0 && b%5 == 0){
                System.out.println(b);

            }
            b++;

        }
    }


}
