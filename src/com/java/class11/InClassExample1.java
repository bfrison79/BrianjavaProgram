package com.java.class11;

import java.util.Scanner;

public class InClassExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter how many numbers we will print!");
        int i = 1;

        while(i <= 10){
            if(i%3==0){
                System.out.println("*");
            }else
            System.out.println(i);

            i++;
        }
    }
}
