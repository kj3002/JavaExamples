package com.company.Chapter2;

/*
	In Java, you can convert one type to another

	For conversions that are widening (i.e. has more value), it can automatically happen
	However, for conversions that are limiting (i.e. from more to less value), you need to cast the type
 */

class ConversionOfTypes {
	public static void main(String args[]) {
		long L;
		double D;

		L = 100123285L;
		D = L; //automatic conversion from long to double

		System.out.println("L and D: " + L + ", " + D);
	}
}
