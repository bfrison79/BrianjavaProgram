package com.java.class08;
//Take single char in the program & check weather given char is vowel or not
//Vowel char are - a, e, i, o, u

public class CheckCharIsVowel {
    public static void main(String[] args) {

        char sVowel = 'a', e, i, o, u;

        if (sVowel == 'a' || sVowel == 'e' || sVowel == 'i' || sVowel == 'o' || sVowel == 'u') {
            System.out.println("Vowel");


        }else{
            System.out.println("Not a Vowel");
        }
    }
}