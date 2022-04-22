package com.java.class17;

import java.util.Scanner;

public class MethodExample {
    static void printLine(int length, char c){
        for(int i=1; i<=length; i++){
            System.out.println(c);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        printLine(30, '=');
        System.out.println("Please enter first number ");
        printLine(30, '=');
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        printLine(30, '*');
        System.out.println("Please enter second number ");
        printLine(30, '*');
        int b = scan.nextInt();

        printLine(30, '~');
        System.out.println("Please enter the operation (add/div/sub/mul) ");
        printLine(30, '~');
        String operatiion = scan.next();

        switch(operatiion){
            //case = (a + b);
        }


    }

}
