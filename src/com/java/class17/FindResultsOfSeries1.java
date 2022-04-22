package com.java.class17;
// find Result of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
public class FindResultsOfSeries1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i<=10; i++){
            if(i % 3 == 0){
                sum = sum - i;

            }else{
                sum = sum + i;
            }
        }
    }
}
