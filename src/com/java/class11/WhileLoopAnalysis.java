package com.java.class11;

import java.util.Scanner;

public class WhileLoopAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();


        int i = 1;   // change number output will change

        while(i<=limit){
            System.out.println(i);
            System.out.println(11-i);
            i++;

        };



    }
}
