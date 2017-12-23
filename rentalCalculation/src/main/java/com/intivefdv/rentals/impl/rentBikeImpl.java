/**
 * 
 */
package com.intivefdv.rentals.impl;

import com.intivefdv.rentals.rentBike;
import com.intivefdv.rentals.beans.Charges;
import com.intivefdv.rentals.beans.Client;
import com.intivefdv.rentals.beans.Rent;

/**
 * @author Miguel Gonzalez
 *
 */
public class rentBikeImpl implements rentBike
{	
	/**
	 * @param quantity
	 * @param rentType
	 * @param peopleQuantity
	 * @param clientCode
	 */
	public Rent calculateRent( int quantity, char rentType, int peopleQuantity, int clientCode) throws Exception 
	{	
		double percentage = 1;
		double totalAmount;
		
		try
		{			
			
			Rent rent = new Rent();
			
			if (validateClient(clientCode))
			{
				percentage = calculatePercentagePromotion(peopleQuantity,rentType);	
				Charges charges = calculateCharges(quantity,rentType);
				//System.out.println(percentage);
				if (percentage != 1)
				{
					totalAmount = charges.getTotalAmount() - (charges.getTotalAmount() * percentage);
				}
				else
				{
					totalAmount = charges.getTotalAmount();
				}
				
				System.out.println(totalAmount);
				Client client = getClient(clientCode);
				rent.setCharges(charges);
				rent.setLastname(client.getLastname());
				rent.setName(client.getName());
				rent.setRentAmount(totalAmount);				
			}

			return rent;
			
		}
		catch (Exception e)
		{
			throw e;
		}
	}
	
	/**
	 * 
	 * @param quantity
	 * @param rentType
	 * @return
	 * @throws Exception
	 */
	private Charges calculateCharges ( int quantity, char rentType) throws Exception
	{
		
		Charges charges = new Charges();
				
		charges.setAmount(getAmountByRentType(rentType));
		charges.setTotalAmount(calculateTotalAmount(quantity, charges.getAmount()));
		charges.setRentType(rentType);
		charges.setQuantity(quantity);
	
		return charges;		
	}
	
	/**
	 * 
	 * @param rentType
	 * @return amount
	 * @throws Exception
	 */
	private float getAmountByRentType( char rentType) throws Exception
	{
		float fee = 0;
		switch (rentType) 
		{
			case 'H':
				
				 	fee = 5;
					
			break;
				
			case 'D':
					
					fee = 20;
				
			break;
			
			case 'W':
				
					fee = 60;
					
			break;
		}
		
		return fee;		
	}
	
	/**
	 * 
	 * @param quantity
	 * @param amount
	 * @return 
	 * @throws Exception
	 */
	private double calculateTotalAmount (int quantity, double amount) throws Exception
	{
		return quantity * amount;
	}
	
	/**
	 * 
	 * @param quantityPeople
	 * @param rentType
	 * @return
	 */
	private double calculatePercentagePromotion(int quantityPeople, char rentType)
	{
		
		double percentage = 0;
		
		switch (rentType) 
		{
			case 'H':
				
				if (quantityPeople >= 3 && quantityPeople <=5)
				{					
					percentage = 0.30;
						
				}
				else
				{
					percentage = 1;
				}

			case 'D':
				
				if (quantityPeople >= 3 && quantityPeople <=5)
				{					
					percentage = 0.35;
						
				}
				else
				{
					percentage = 1;
				}
			break;
			
			case 'W':
				
				if (quantityPeople >= 3 && quantityPeople <=5)
				{					
					percentage = 0.37;
						
				}
				else
				{
					percentage = 1;
				}
				
			break;
		}	
		
		return percentage;		
	}
	
	/**
	 * 
	 * @param clientCode
	 * @return
	 */
	private boolean validateClient (int clientCode)
	{
		return true;
	}
	
	/**
	 * 
	 * @param clientCode
	 * @return
	 */
	private Client getClient( int clientCode)
	{
		Client client = new Client();
		
		client.setName("Miguel");
		client.setLastname("Gonzalez");
		
		return client;
	}
}
