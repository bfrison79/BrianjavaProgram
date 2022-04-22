package com.java.class17;

import java.util.Scanner;

// Print all prime numbers from 1 to 50
public class PrintPrimeNumbersFrom1to50Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);          // User input number
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){                // Print numbers from 1 to 50, if scanner not used
            if(isPrime(i)==true){                    // Checking if number is prime
                System.out.println(i);
            }
        }
    }



    static boolean isPrime(int num){                 // Java creates another memory
        int count = 0;

        for(int i = 1; i <= num; i++){               // Java creates another variable and check for prime number
            if (num % i == 0){
                count++;

            }
        }
        if (count == 2){                             // Java will check for 2 numbers identifying a prime number
            return true;
        }else {
            return false;
        }
    }
    }

