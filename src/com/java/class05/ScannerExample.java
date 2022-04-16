package com.java.class05;
// Scanner class - to get user input in program (from keyboard)
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println(num1 + num2);

        Scanner sc = new Scanner(System.in);

        int num3 = sc.nextInt(), num4 = sc.nextInt();
        System.out.println(num3 + num4);

    }

}