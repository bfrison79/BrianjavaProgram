package com.java.class08;

// Take three number from users and print maximum number out of three numbers

import java.util.Scanner;

public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        //Input
        System.out.println("Please enter three numbers: ");
        Scanner sc = new Scanner(System.in);


        int numb1 = sc.nextInt(), numb2 = sc.nextInt(), numb3 = sc.nextInt();


        //Output
        if (numb1 > numb2 && numb1 > numb3) {
            System.out.println(numb1 + "Is greatest");
        } else if (numb2 > numb3) {
            System.out.println(numb2);
        } else {
            System.out.println(numb3);
        }


    }
    }