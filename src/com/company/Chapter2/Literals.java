package com.company.Chapter2;

/*
	Literals are fixed values that are represented in a human-readable form. For example, the number 100 is a literal.
	Literals are also commonly referred to as constants
	Java literals can be any primitive data type, and a String

	In addition, there are special character escape sequences for certain characters
 */
class Literals {
	public static void main(String args[]) {
		System.out.println("\'"); //prints out '
		System.out.println("\""); //prints out "
		System.out.println("\\"); //prints out \
		System.out.println("\n"); //new line
		System.out.println("\t"); //tab

		/*
			Java also accepts numbers in octal, binary, and hexadecimal form
		 */

		int hex = 0xFF; //0x means hexadecimal
		int oct = 011; //beginning with 0 means octal
		int binary = 0b1100; //beginning with 0b means binary
	}
}
