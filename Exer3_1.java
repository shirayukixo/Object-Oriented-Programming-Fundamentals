// Exercise 3 (Odd Sum and Even Sum)

// Description of the Problem
// Write an application that reads an integer and determines and prints whether
// it is odd or even.

import java.util.Scanner;

public class Exer3_1 {

	public static void main(String[] args) {
		
		// define Scanner
		Scanner input = new Scanner(System.in);	
		
		// define variables
		int num;
		
		// user input
		System.out.print("Enter integer: ");
		num = input.nextInt();
		
		// processing & print output
		if (num % 2 == 0)
			System.out.print("Number is even");
		else
			System.out.print("Number is odd");		

	} // end main

} // end class
