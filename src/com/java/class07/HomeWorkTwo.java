package com.java.class07;
// 2. Write a program to check given character is Vowel or Not
//   Vowel characters are - 'a','e','i','o','u'
//   (If you're not using scanner class it's fine you can directly take char value in program)



public class HomeWorkTwo {
    public static void main(String[] args) {

       char isVowel ='a';

       switch(isVowel){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               System.out.println("Character is a vowel");
           break;

           default:
               System.out.println("Character is not a vowel");
       }



    }
}
