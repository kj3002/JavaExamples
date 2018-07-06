package com.company.Chapter2;

/*
	Shows how scope in Java works

	In Java, you can initialize variables in any block
	However, a variable inside the block cannot be used by the higher-arching program it is in
	Additionally, when you re-initialize a variable in the function, the previous value is lost

 */
class ScopeDemo {
	public static void main(String args[]) {
		int x; //known to all code within main

		// int y; <- when this is declared, y cannot be re-initialized in the lower-level scope.
		x = 10;
		if(x == 10) { //start of new scope
			int y = 20; //only known to this block

			//x and y both known here

			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}

		//y = 100; <- doesn't work because y is out of its scope

		//x is still known here
		System.out.println("x is " + x);

		for(x = 0; x < 3; x++) {
			int y = -1;
			System.out.println("y is: " + y);
			y = 100;
			System.out.println("y is now: " + y);
			//notice how it prints out -1, then 100, and not 100 and 100, etc..

			/*
				also notice how y needs to be re-initialized in this scope, even though in the previous scope
				it was initialized

				This is because this scope cannot access the previous scope
			 */

		}
	}
}
