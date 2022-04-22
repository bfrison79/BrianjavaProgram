package com.java.class16;
// Find result of given series 1+2+3+4+5+6+7+8+9
public class FindResultOfGivenSeries {
    public static void main(String[] args) {
        int sum = 0;

        for(int b = 0; b <= 10;  b++){
            if(b % 3 == 0){
                sum = sum -b;
            }else{
                sum = sum + b;
            }
        }
        System.out.println("result is: " + sum);
    }
}
