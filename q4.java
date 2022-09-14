import java.util.*;
public class q4 {
    //Write a Java program to swap the values of integer number with using temporary variable and without using temporary variable
    public static void main(String[] args){
        System.out.println("Enter first number: ");
        // Creating a Scanner object
        Scanner int1 = new Scanner(System.in); 
        int  num1 = int1.nextInt();
        
        System.out.println("Enter second number: ");
        // Creating a Scanner object
        Scanner int2 = new Scanner(System.in); 
        int  num2 = int2.nextInt();

        //before swapping
        System.out.println("Before swapping the number are: ");
        System.out.println("num1: " + num1);
        System.out.println("num2: "+ num2);
          
       //swapping the two number 

       //storing the difference of the two numbers
       num1 = num1 - num2;
       //adding the difference to the other number hence one of the number is swapped
       num2 = num2 + num1;
       //subtracting this difference from the now swapped number to achieved the initial number
       num1 = num2 - num1;
       System.out.println("After swapping the number are: ");
       System.out.println("num1: " + num1);
       System.out.println("num2: "+ num2);
    }
}
