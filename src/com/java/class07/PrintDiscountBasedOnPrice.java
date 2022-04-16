package com.java.class07;
//Take a price from user and print discount value based on price

//less than 100 then print - No discount
//less than 500 then print - 5%
//less than 1000 then print - 10%
//more than or equal 1000 then print - 15%

import java.util.Scanner;

public class PrintDiscountBasedOnPrice {
    public static void main(String[] args) {
        System.out.println("Please enter a price : ");
        Scanner sc = new Scanner(System.in);
        int numb = sc.nextInt();




        if (numb < 100) {
            System.out.println("No Discount");
        }else if (numb < 500){
            System.out.println("5%");
        }else if (numb < 1000){
            System.out.println("10%");
        }else if (numb > 1000){
            System.out.println("15%");
        }else{
            System.out.println("Print discount value: ");
        }

    }
}