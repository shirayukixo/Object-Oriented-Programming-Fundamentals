// Exercise 2 (Separating Digits in an Integer)

// Description of the Problem
// Write an application that inputs one number consisting of five digits from the
// user, separates the number into its individual digits and prints the digits 
// separated from one another by three spaces each. For example, if the user
// types in the number 423339, the program should print "4 2 3 3 9". Assume
// that the user enters the correct number of digits

import java.util.Scanner;

public class Exer2_1 {

	public static void main(String[] args) {
		
		// define Scanner
		Scanner input = new Scanner(System.in);	
		
		// define variables 
		int num;		
		
		// user input
		System.out.print("Enter five digit integer: ");
		num = input.nextInt();		
		
		// processing & print output
		if (num >= 10000 && num <= 99999) {  
			System.out.printf("Digits in %d are ", num);
			System.out.printf("%d   ", num / 10000);
			System.out.printf("%d   ", (num % 10000) / 1000);
			System.out.printf("%d   ", (num % 1000) / 100);
			System.out.printf("%d   ", (num % 100) / 10);
			System.out.printf("%d   ", num % 10);
			
		} // end if
			
		if (num < 10000 || num > 99999)
			System.out.print("Invalid digits entered. ");
			
	} // end main

} // end class
