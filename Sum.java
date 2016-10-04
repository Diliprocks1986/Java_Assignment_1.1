// Write a program to print the sum of two numbers without using + operator

import java.util.Scanner;

public class Sum {
 
public static void main(String [] args){
	
	    // Scanner for input
		Scanner inputs = new Scanner(System.in);  
		System.out.print("Enter First Number :");
		// Saving First input in a variable	
		int firstNumber = inputs.nextInt();
		System.out.print("Enter Second Number :");		
		// Saving Second input in a variable
		int secondNumber = inputs.nextInt();
	
        // Calculation For Sum
		int sum = firstNumber-(-secondNumber);
		// Printing the Sum
		System.out.println("Sum of ("+firstNumber+"+"+secondNumber+") is- "+ sum);
}
}