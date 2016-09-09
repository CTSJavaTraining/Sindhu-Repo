package com.cts.training;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * address details of employee
 * 
 * @author 542224
 *
 */
@Entity
@Table(name = "AddressDetails")
public class AddressDetails {

	@Id
	@GeneratedValue
	@Column(name = "addressId",unique=true)
	private int addressId;

	@Column(name = "doorno")
	private int doorNo;

	@Column(name = "streetname")
	private String streetName;

	@Column(name = "state")
	private String state;

	@ManyToOne
	@JoinColumn(name = "empId")
	private EmpDetails empdetails;

	public EmpDetails getEmpdetails() {
		return empdetails;
	}

	public void setEmpdetails(EmpDetails empdetails) {
		this.empdetails = empdetails;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	/**
	 * 
	 * @return the doorNumber
	 */
	public int getDoorNo() {
		return doorNo;
	}

	/**
	 * doorNumber to be set
	 * 
	 * @param doorNumber
	 */
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	/**
	 * 
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * streetName to be set
	 * 
	 * @param streetNmae
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * state to be set
	 * 
	 * @param state
	 */
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressDetails [addressId=" + addressId + ", doorNo=" + doorNo + ", streetName=" + streetName
				+ ", state=" + state + ", empdetails=" + empdetails + "]";
	}
}
