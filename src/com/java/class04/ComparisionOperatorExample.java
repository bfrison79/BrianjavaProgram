package com.java.class04;

public class ComparisionOperatorExample {

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40;

        System.out.println(a==b); // false
        System.out.println(a < b); // true
        System.out.println(b >= c); // false
        System.out.println(c <= d); // true
        System.out.println(d >= a); // true
        System.out.println(b == b); // true
        System.out.println(a >= d);  // false
        System.out.println(b <= a); // false

        System.out.println(c==d); // false
        System.out.println(c >= b); // true
    }

}
