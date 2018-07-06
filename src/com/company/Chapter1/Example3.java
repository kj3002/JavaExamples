package com.company.Chapter1;

/*
	This program illustrates the differences between int and double.

 */
class Example3 {
	public static void main(String args[]) {
		int var; //declares an int variable
		double x; //declares a floating-point variable

		var = 10;
		x = 10;

		System.out.println("Original value of var: " + var);
		System.out.println("Original value of x: " + x);
		System.out.println(); //prints a blank line

		//now, divide both by 4
		var = var / 4;
		x = x / 4;

		System.out.println("var after division: " + var);
		System.out.println("x after division: " + x);

		//You should see that var returns 2, and x returns 2.5
		//The decimal value resulting from division of the integer is lost
	}
}
