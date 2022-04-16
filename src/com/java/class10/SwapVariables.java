package com.java.class10;

public class SwapVariables {
    public static void main(String[] args) {

        int a = 10, b = 20;
        // create temp variable

        int temp = a;

        a=b;

        b= temp;


        System.out.println(a);
        System.out.println(b);
    }
}
