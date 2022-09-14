/*
 * Sukhmanpreet Kaur
 * 19105126
 */
import java.util.*;
public class q2 {
    // Write a Java program to print multiplication of two floating point numbers.
    public static void main(String[] args){
       
        System.out.println("Enter first number: ");
        // Creating a Scanner object
        Scanner f1 = new Scanner(System.in); 
        Float num1 = f1.nextFloat();
        
        System.out.println("Enter second number: ");
        // Creating a Scanner object
        Scanner f2 = new Scanner(System.in); 
        Float num2 = f2.nextFloat();

        Float result = num1*num2;

        System.out.println("Multiplication: " + result );

    }
}
