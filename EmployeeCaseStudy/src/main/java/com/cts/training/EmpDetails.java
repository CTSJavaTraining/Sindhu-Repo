package com.cts.training;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * employee details
 * 
 * @author 542224
 *
 */
@Entity
@Table(name = "EmpDetails")
public class EmpDetails {
	@Id
	@GeneratedValue
	@Column(name = "empId",unique=true)
	private int empId;

	@Column(name = "name")
	private String name;

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private int salary;

	@Column(name = "bonus")
	private int bonus;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "empdetails")
	private List<AddressDetails> address;

	@Column(name = "doj")
	private String doj;

	@Column(name = "grade")
	private String grade;

	@Column(name = "emailid",unique=true)
	private String emailId;

	/**
	 * 
	 * @return the Id
	 */
	public int getId() {
		return empId;
	}

	/**
	 * id to be set
	 * 
	 * @param id
	 */
	public void setId(int empId) {
		this.empId = empId;
	}

	/**
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name to be set
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * designation to be set
	 * 
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * 
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * salary to be set
	 * 
	 * @param salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * bonus to be set
	 * 
	 * @param bonus
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/**
	 * 
	 * @return the address
	 */
	public List<AddressDetails> getAddress() {
		return address;
	}

	/**
	 * address to be set
	 * 
	 * @param address
	 */
	public void setAddress(List<AddressDetails> address) {
		this.address = address;
	}

	/**
	 * 
	 * @return the DOJ
	 */
	public String getDOJ() {
		return doj;
	}

	/**
	 * DOJ to be set
	 * 
	 * @param dOJ
	 */
	public void setDOJ(String dOJ) {
		doj = dOJ;
	}

	/**
	 * 
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * grade to be set
	 * 
	 * @param grade
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * 
	 * @return the EmailID
	 */
	public String getEmailID() {
		return emailId;
	}

	/**
	 * emailID to be set
	 * 
	 * @param emailID
	 */
	public void setEmailID(String emailID) {
		emailId = emailID;
	}

	// TODO Auto-generated method stub
	public String checkEmail(String emailId) {
		if (emailId.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			return emailId;
		}
		return null;

	}

	public int calculateBonus(String grade, int salary) {

		if ("A".equals(grade)) {

			int bonus = ((salary * 8) / 100);
			return bonus;
		} else if (grade.equals("B")) {
			return (int) ((salary * 6.5) / 100);
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "EmpDetails [empId=" + empId + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", bonus=" + bonus + ", doj=" + doj + "]";
	}
}
