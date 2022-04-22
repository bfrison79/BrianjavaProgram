package com.java.class17;

import java.util.Scanner;

public class Hwk {

    public static void main(String[] args) {

        // Take number from user
        System.out.println("Please enter a number ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;

        for(int i = 1; i <= num; i++){
           if(num % i == 0){
               System.out.println(i);
               count++;
           }
        }
        if (count == 2) {
            System.out.println("Prime ");

        }else{
            System.out.println("Not Prime ");
        }
    }
}
