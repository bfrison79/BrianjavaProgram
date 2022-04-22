package com.java.class17;

import java.util.Scanner;
// Print Prime Numbers 1 to 50
public class PrintPrimeNumbers1to50 {
    public static void main(String[] args) {
        System.out.println("Prime Numbers: ");
       int num = 50, count;
       for (int i = 1; i<=num; i++){
           count = 0;
          for (int j = 2; j<= i/2; j++) {
              if (i%j==0){
                  count++;
                  break;
              }// end of if statement
          }//end of 2nd for loop
           if (count == 0){
               System.out.println(i);
           }
       }//end of 1 first for loop

    }

}