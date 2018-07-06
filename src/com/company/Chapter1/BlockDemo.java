package com.company.Chapter1;

/*
	Demonstrate a block of code
 */
class BlockDemo {
	public static void main(String args[]) {
		double i, j, d;

		i = 5;
		j = 10;


		//the target of this if is a block
		if(i != 0) { //start of a block
			System.out.println("i does not equal zero");
			d = j/i;
			System.out.println("j / i is " + d);
		} //end of a block

		//Try setting i to zero after running it. You'll see that the entire code inside the block is skipped
	}
}
