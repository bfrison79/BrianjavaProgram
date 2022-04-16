package com.java.class14;

public class StringMethodDemo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello world";
        String str3 = "Hello World! Welcome to Devx!";

        // 1. Using equals with String
        System.out.println("1. Equality: " +str1.equals(str2));
        System.out.println("=====================================================================================");

        // 2. Using equals with ignoring
        System.out.println("2. Equality ignoring case: " +str1.equalsIgnoreCase(str2));
        System.out.println("=====================================================================================");

        // 3. Contains
        System.out.println("3. Contains: " +str3.contains(str1));
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        System.out.println("3. 1 Contains: " +str3LowerCase.contains(str2LowerCase));
        System.out.println("=====================================================================================");
        // 4. Changing the case of String
        System.out.println("4. Upper Case:" +str3.toUpperCase());
        System.out.println("4. Lower Case: " +str3.toLowerCase());
        System.out.println("=====================================================================================");

        // 5. Find index of character
        System.out.println("5. Index of Char: "+str1.indexOf('W'));
        System.out.println("5. Last Index of Char: "+str1.lastIndexOf('W'));
        System.out.println("=====================================================================================");

        // 6. Find character at index (1st character starts with 0)
        System.out.println("6. Index of Char: " +str1.charAt(0));
        System.out.println("=====================================================================================");

        // 7. Length of String (All characters counted)
        System.out.println("7. Length of String" + str1.length());
        System.out.println("=====================================================================================");

        // 8. Length of String'
        str1 = "             ";
        str3 = "";
        System.out.println("8. Empty: "+ str1.isEmpty());
        System.out.println("8. Empty: "+ str3.isEmpty());
        System.out.println("8. Blank: "+ str1.isBlank());
        System.out.println("8. Blank: "+ str1.isBlank());
        System.out.println("=====================================================================================");


        // 9. Replace & ReplaceAll
        str1 = "INR 200 INR 300 INR 500";
        str3 = "Devx";
        System.out.println("9. Replace " +str1.replace("INR","USD"));
        System.out.println("9. Replace: " +str1.replaceAll("[0-9]", ""));
        System.out.println("=====================================================================================");

        // 10. Format
        str1 = "Welcome %s, Welcome to %s";
        System.out.println(String.format(str1,"10. Format: Brian","ESPN"));
        System.out.println("=====================================================================================");

        // 11. Substring
        str1 = "Welcome to java class. Today is fun day";
        System.out.println("11. Substring: " + str1.substring(7));
        System.out.println("11. Substring: " + str1.substring(0,7));
        System.out.println("=====================================================================================");

        // 12. Split (each word separately)
        str1 = "Welcome to java class";
        String [] words = str1.split(" ");
        // Find length of String
        System.out.println(words.length);

        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
        }

    }
}
