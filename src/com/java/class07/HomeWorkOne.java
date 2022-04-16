package com.java.class07;

//1. Write a java program to Find Company name from the given product
//   Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
//   Possible Outputs = {google, facebook, microsoft}

import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        System.out.println("Please enter a Company name : ");
        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine();

        switch(company){

            case "Gmail":
            case "Youtube":
            case "Hangouts":
                System.out.println("Google");
            break;

            case "Whatsapp":
                System.out.println("Facebook");
            break;

            case "Skype":
            case "Outlook":
                System.out.println("Microsoft");
            break;

            default:
                System.out.println("Please enter a company name");

        }
    }

}
