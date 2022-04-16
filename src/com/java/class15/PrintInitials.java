package com.java.class15;

public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Brian D Frison";
        String str1 = "Brian Frison";
        String [] words = fullName.split(".");

        String parts[] = fullName.split("");

        String firstName = parts [0];

        String lastName = parts [8];

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0) + ".");












    }
}
