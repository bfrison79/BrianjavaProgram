package atHomePractice.Day1;

public class AssignmentTwo {
    public static void main(String[] args) {
    /*
       Write a Java program that has two integers number1 and number2 prints the sum, the difference, the product.




number1: 25
number2: 5
Expected Output :
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
     */

       int numb1 = 2343;
       int numb2 = 657;
        System.out.println("Sum of two integers: " + (numb1 + numb2));
        System.out.println("Difference of two integers: " + (numb1 - numb2));
        System.out.println("Product of two integers: " + (numb1 * numb2));


        int candy = 4;
        int chip = 8;
        int soda = 14;
        double tax = 1.09;
        double subtotal = 0;
        double total = 0;

        subtotal = ((2*candy) + (5*chip) + (10*soda));
        total = (tax * subtotal);
        System.out.println(total);

    }
}
