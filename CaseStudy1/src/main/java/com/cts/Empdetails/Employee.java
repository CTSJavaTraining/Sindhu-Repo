package com.cts.Empdetails;
import java.io.Serializable;;
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	// TODO:Acees modifiers
	private int id;
	private String name;

	/**
	 * 
	 * @param id
	 * @param name
	 */
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
