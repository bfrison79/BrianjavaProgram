package com.java.class15;
// Write a program to print each component of String into separate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {
    String address = "33 Cayman CT.";
    String str1 = "33 Cayman CT.";

    String [] words = address.split(",");
        //System.out.println(words[0].trim());
       // System.out.println(words[1].trim());
        //System.out.println(words[2].trim());
        //System.out.println(words[3].trim());
        //System.out.println(words[4].trim());

        System.out.println(str1.length());

        for(int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }
    }
}







