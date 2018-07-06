package com.company.Chapter2;

/*
	In Java, there are two types of operators. There's the regular operator, and the short-circuit operator

	Unlike the normal operator, the short-circuit operator will only run the second statement if necessary
 */
class ShortCircuitOperators {
	public static void main(String args[]) {
		int n, d, q;

		n = 10;
		d = 0;
		if(d != 0 && (n%d) ==0) { //with a short circuit operator, it will run the first statement, but not the second one
			System.out.println(d + " is a factor of " + n);
		}

		//try without a short circuit operator
		if(d != 0 & (n % d) ==0) { //both expressions are evaluated, allowing for divison over 0 to occur
			System.out.println(d + " is a factor of " + n);
		}

		//However, sometimes regular operators are useful

		int i = 0;

		if(false & (++i<100)) //will increment i, even when the statement is false
			System.out.println("this won't be displayed");
		System.out.println("if statement executed: " + i);

	}
}
