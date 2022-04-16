package com.java.class07;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
            case 4:
                System.out.println("Four");
            case 5:
                System.out.println("Five");
            case 6:
                System.out.println("Six");
            case 7:
                System.out.println("Seven");
            case 8:
                System.out.println("Eight");
            case 9:
                System.out.println("Nine");
            default:
                System.out.println("Please enter a number from 0-9");
        }
    }
}
