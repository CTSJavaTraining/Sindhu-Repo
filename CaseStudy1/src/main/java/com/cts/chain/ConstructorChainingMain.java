package com.cts.chain;

/**
 * Class explains about constructor chaining
 * 
 * @author 542224
 *
 */
public class ConstructorChainingMain {

	/**
	 * object is created.display() is invoked
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Display obj = new ConstructorChaining();
		obj.display();

		ConstructorChaining obj1 = new ConstructorChaining(5, 5, 15);

	}
}
