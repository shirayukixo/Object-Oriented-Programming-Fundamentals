// Exercise 1 (Arithmetic, Largest Value and Smallest Value)

// Description of the Problem
// Write an application that inputs three integers from the user and display the
// sum, average, product, smallest and largest of the numbers.


import java.util.Scanner;

public class Exer1_1 {

	public static void main(String[] args) {
		
		// define scanner 		
		Scanner input = new Scanner(System.in);
		
		// define variables
		int first, second, third;
		int sum, product, smallest, largest;
		double average;		
		
		// user input
		System.out.print("Enter first integer: ");
		first = input.nextInt();
		System.out.print("Enter second integer: ");
		second = input.nextInt();
		System.out.print("Enter third integer: ");
		third = input.nextInt();		
		
		// processing
		sum = first + second + third;
		product = first * second * third;
		average = sum / 3;
		
		smallest = first;
		if (second < first)
			smallest = second;
		if (third < second)
			smallest = third;
		
		largest = first;
		if (second > first)
			largest = second;
		if (third > second)
			largest = third;		
		
		// print output		
		System.out.printf("\nFor the numbers %d, %d and %d\n", first, second, third);
		System.out.println("Largest is " + largest);
		System.out.println("Smallest is " + smallest);
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.printf("Average is %.2f\n", average);

	} // end main

} // end class
