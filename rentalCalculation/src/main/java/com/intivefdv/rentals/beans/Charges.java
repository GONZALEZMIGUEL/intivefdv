package com.intivefdv.rentals.beans;

public class Charges {
	
	/**
	 * Quantity 
	 */
	private int quantity;
	
	/**
	 * RentType
	 */
	private char rentType;

	/**
	 * Amount
	 */
	private float amount;
	
	/**
	 * Total Amount
	 */
	private double totalAmount;

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the rentType
	 */
	public char getRentType() {
		return rentType;
	}

	/**
	 * @param rentType the rentType to set
	 */
	public void setRentType(char rentType) {
		this.rentType = rentType;
	}

	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	
	
}
