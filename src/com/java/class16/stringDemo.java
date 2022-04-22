package com.java.class16;

import java.util.Scanner;

public class stringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";

        // String buffer uses the buffer mechaism to protect data  from being
        // access and update simultaneously, so it's thread-safe

        StringBuffer SBuffer = new StringBuffer("Hello");
    }
}
