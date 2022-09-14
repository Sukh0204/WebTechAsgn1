/*
 * Sukhmanpreet Kaur
 * 19105126
 */
import java.util.*;
public class q3 {
    //Write a Java program to compute quotient and remainder and print it.
    public static void main(String[] args){
        System.out.println("Enter dividend: ");
        // Creating a Scanner object
        Scanner int1 = new Scanner(System.in); 
        int  num1 = int1.nextInt();
        
        System.out.println("Enter divisor: ");
        // Creating a Scanner object
        Scanner int2 = new Scanner(System.in); 
        int  num2 = int2.nextInt();

        int quotient = num1/num2;
        int remainder = num1%num2;

        System.out.println("Quotient  is: " + quotient + " Remainder is : " + remainder);
    }
}
