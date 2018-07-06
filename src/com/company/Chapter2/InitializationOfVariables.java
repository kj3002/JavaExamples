package com.company.Chapter2;

/*
	Initialization of Variables
 */
class InitializationOfVariables {
	public static void main(String args[]) {
		double radius = 4, height = 5; //standard initialization

		//dynamic initialization
		double volume = 3.1415 * Math.pow(radius, 2) * height;
		//it is able to do this because during initialization, radius and height are already known, so volume can be initialized

		System.out.println("Volume is: " + volume);
	}
}
