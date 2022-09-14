/*
 * Sukhmanpreet Kaur
 * 19105126
 */
import java.util.*;
import  java.lang.Math;
public class q1{
    // Write a Java program to print addition and subtraction of two integer numbers.
    public static void main(String[] args){
        // Take the Input
        // print additive and subtractive output

        System.out.println("Enter first number: ");
        // Creating a Scanner object
        Scanner int1 = new Scanner(System.in); 
        int  num1 = int1.nextInt();
        
        System.out.println("Enter second number: ");
        // Creating a Scanner object
        Scanner int2 = new Scanner(System.in); 
        int  num2 = int2.nextInt();

        System.out.println("Addition: " + Math.abs(num1+num2) + " Subtraction: " + Math.abs(num1-num2));
     
    }
}