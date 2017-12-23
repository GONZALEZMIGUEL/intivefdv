package com.intivefdv.rentals.beans;

public class Rent {
	
	private Charges charges;
	private String name;
	private String lastname;
	private double rentAmount;
	/**
	 * @return the charges
	 */
	public Charges getCharges() {
		return charges;
	}
	/**
	 * @param charges the charges to set
	 */
	public void setCharges(Charges charges) {
		this.charges = charges;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the rentAmount
	 */
	public double getRentAmount() {
		return rentAmount;
	}
	/**
	 * @param rentAmount the rentAmount to set
	 */
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	

}
