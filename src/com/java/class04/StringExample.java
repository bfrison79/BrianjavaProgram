package com.java.class04;

public class StringExample {
    // if we do addition with string it'll be concatenation
    //String + String = StringString
    //String + Int = StringInt
    public static void main(String[] args) {
        int a = 10,  b = 20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a);
        System.out.println(str1 + str2);

        System.out.println(str1 + a + b); //Hello30
        System.out.println(a + b + str1);
        System.out.println(a + b + str1); //30Hello

        System.out.println("a"+ b + c); // a50

        System.out.println(str2 + str1 + a + b); // JavaHello1020
        System.out.println(a + c + str2 + str1); // 40JavaHello

    }
}
