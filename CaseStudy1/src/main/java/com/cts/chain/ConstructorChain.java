package com.cts.chain;

class ConstructorChain implements Disp {

	// default constructor of the class
	public ConstructorChain() {
		System.out.println("Default constructor");
	}

	public ConstructorChain(String str) {
		this();
		System.out.println("Parametrized constructor with single param");
	}

	// It will call the constructor with String argument
	public ConstructorChain(String str, int num) {
		this("Hello");
		System.out.println("Parametrized constructor with double args");
	}

	// It will call the constructor with (String, integer) arguments
	public ConstructorChain(int num1, int num2, int num3) {
		this("Hello", 2);
		System.out.println("Parametrized constructor with three args");
	}

	public void display() {
		System.out.println("run");
	}
}
