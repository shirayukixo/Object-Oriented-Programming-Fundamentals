// Exercise 4 (Control Structures)

// Description of the Problem
// A website sells three products whose retail prices are as follows: 
// Product 1, $2.98; product 2, $4.50; and product 3, $9.98.
// Write an application that reads a series of pairs of numbers as follows:
// a) Product number
// b) Quantity sold
// Your application should use a switch statement to determine the retail price
// for each product. It should calculate and display the total retail value of 
// all products sold. Use a sentinel-controlled loop to determine when the
// application should stop looping and display the final results.

import java.util.Scanner;

public class Exer4_1 {

	public static void main(String[] args) {
		
			// define scanner 
			Scanner input = new Scanner(System.in);
			
			// define variables			
			double product1 = 0;
			double product2 = 0;
			double product3 = 0;
			int product;
			int quantity;
			
			// user input
			System.out.print("Enter product number (1-3) (0 to stop): ");
			product = input.nextInt();
			
			// processing			
			while (product != 0) { // while loop 1 
				if (product >= 1 && product <= 3 ) { // while loop 2
					System.out.print("Enter quantity sold: ");
					quantity = input.nextInt();
					
					switch (product) { // switch
						case 1:
							product1 = product1 +(2.98 * quantity);
							break;
						case 2:
							product2 = product2 +(4.50 * quantity);
							break;
						case 3:
							product3 = product3 +(9.98 * quantity);
							break;
						default:
							break;					
			
					} // end switch					
												
				} // end while loop 2 
				else
				System.out.print("Invalid product number\n");
				System.out.print("Enter product number (1-3) (0 to stop): ");
				product = input.nextInt();			
			
			} // end while loop 1
			// print output
			System.out.printf("\nProduct 1: $%.2f\n", product1);
			System.out.printf("Product 2: $%.2f\n", product2);
			System.out.printf("Product 3: $%.2f\n", product3);			
		
	} // end main

} // end class
