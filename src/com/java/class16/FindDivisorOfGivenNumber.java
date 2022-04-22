package com.java.class16;
// Find divisor of given number (Input - 6, output will be 1 2 3 4 5 6)

import java.util.Scanner;

public class FindDivisorOfGivenNumber {
    public static void main(String[] args) {
        System.out.println("Please Enter a Number ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int b = 1; b <= 10; b++) {
            if(num % b == 0){
                count++;
            }

        }


    }   }