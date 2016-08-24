package com.cts.chain;

public class Chaining {

	public static void main(String[] args) {
		Disp obj = new ConstructorChain();
		obj.display();

		ConstructorChain obj1 = new ConstructorChain(5, 5, 15);

	}
}
