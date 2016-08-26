package com.cts.chain;

/**
 * calling one constructor from another using this()
 * 
 * @author 542224
 *
 */
class ConstructorChaining implements Display {

	/**
	 * default constructor of the class
	 */
	public ConstructorChaining() {
		System.out.println("Default constructor");
	}

	/**
	 * It will call the default constructor
	 * 
	 * @param str
	 */
	public ConstructorChaining(String str) {
		this();
		System.out.println("Parametrized constructor with single param");
	}

	/**
	 * It will call the constructor with String argument
	 * 
	 * @param str
	 * @param num
	 */
	public ConstructorChaining(String str, int num) {
		this("Hello");
		System.out.println("Parametrized constructor with double args");
	}

	/**
	 * It will call the constructor with (String, integer) arguments
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public ConstructorChaining(int num1, int num2, int num3) {
		this("Hello", 2);
		System.out.println("Parametrized constructor with three args");
	}

	/**
	 * Implementation of display() defined in Display interface
	 */
	public void display() {
		System.out.println("run");
	}
}
