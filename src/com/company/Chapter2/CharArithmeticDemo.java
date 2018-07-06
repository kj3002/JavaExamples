package com.company.Chapter2;

//character variables can be handled like integers
class CharArithmeticDemo {
	public static void main(String args[]) {
		char ch;

		ch = 'X'; //assigning ch the value 'X'
		System.out.println("ch contains " + ch);

		ch++;
		System.out.println("ch is now " + ch);

		ch = 90; //ch is assigned the value of Z
		System.out.println("ch is now " + ch);

		/*
			chars in Java use ASCII, in order to make languages more portable throughout all computational devices.
			This is why you can use integer values for chars, as there is a designated value for each char
		 */
	}
}
