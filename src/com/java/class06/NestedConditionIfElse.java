package com.java.class06;
//age and weight .age should be >=18 and weight >=50
import java.util.Scanner;

public class NestedConditionIfElse {
    public static void main(String[] args) {
        System.out.println("Are you Eligible");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int weight = sc.nextInt();
        if(age>=18){
            //if condition is true than we will move to else part weight
           if (weight >= 50){ //if condition false it will move to next statement

           }
            System.out.println("You are Eligible");
        }else{
            System.out.println("You are not Eligible");


        }

    }
}
