package com.java.class07;
// 3. Write a program to take username and password1 from user and print appropriate message
//        based on below conditions
// 1. If username correct and password1 correct ---> Login successful
// 2. If username correct and password1 incorrect --> Invalid password
// 3. If username incorrect and password1 correct --> Invalid username
// 2. If username incorrect and password1 incorrect --> Login unsuccessfu/

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {

        String username = "Java";
        String password = "Class";
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter username: ");
        String userNameInput = sc.nextLine();
        System.out.print("Please enter password: ");
        String passwordInput = sc.nextLine();

        if (username.equals(userNameInput) && password.equals(passwordInput)){
            System.out.println("Login Successful");
        }else if(username.equals(userNameInput) && !password.equals(passwordInput)){
            System.out.println("Invalid password");
        }else if(!username.equals(userNameInput) && password.equals(passwordInput)){
            System.out.println("Invalid username");
        }else{
            System.out.println("Login unsuccessful");
        }




    }
}
