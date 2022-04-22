package com.java.class18;

// Merge two words with three characters one by one and print them
// if words have more than three characters print error message "Incorrect input! Cannot merge!"

public class MergeTwoWords {
    public static void main(String[] args) {
        String word1 = "ice";
        String word2 = "sea";
        System.out.println("Merging words: " + word1 + "," + word2);
        System.out.println(printMerge(word1, word2));

    }
    static String printMerge(String word1, String word2){  // Function
        String mergeString="";
        if(word1.length() > 3 || word2.length() > 3){     // Java checking the length of word1 and word2
            System.out.println("Invalid Input");
        }else{
            for(int i=0; i<word1.length(); i++){
                mergeString = mergeString + word1.charAt(i) + word2.charAt(i);  // Java checking each character in word1/word2
            }
        }
        return mergeString;
    }
}


// Method name   (mandatory)
// Method parameter (optional)
// Method return type (Mandatory)
// Method body (optional if it's void)
