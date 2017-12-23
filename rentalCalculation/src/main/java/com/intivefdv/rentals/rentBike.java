/**
 * 
 */
package com.intivefdv.rentals;

import com.intivefdv.rentals.beans.Rent;

/**
 * @author Miguel Gonzalez
 *
 */
public interface rentBike {

	public Rent calculateRent ( int quantity, char rentType, int peopleQuantity, int clientCode) throws Exception;

}
