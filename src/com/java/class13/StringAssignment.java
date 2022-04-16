package com.java.class13;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Create three String variable ->
// initialize two variable with constant values
// take third variable value from user using scanner class
// Compare 1st and 2nd using == operator
// Compare 2nd and 3rd using == operator
// Compare 1st and 3rd using .equals() method
public class StringAssignment {
    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
    String mango = "fruit";
    String peach= "fruit";
    String apple = scan.nextLine();

    if(mango == peach){
        System.out.println("True");

    }else {
        System.out.println("false");

    }if (apple.equals(peach)){
        System.out.println("true");
    }else{
        System.out.println("false");

    }if(apple.equals(mango)){
        System.out.println("true");
    }else{

        System.out.println("false");
    }




}
}