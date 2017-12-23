package com.intivefdv.main;

import com.intivefdv.rentals.rentBike;
import com.intivefdv.rentals.beans.Rent;
import com.intivefdv.rentals.impl.rentBikeImpl;

public class main 
{

	public static void main(String[] args)
	
	{
		int quantity;
		char rentType;
		int peopleQuantity;
		int clientCode;
		
		quantity = 41;
		rentType = 'W';
		peopleQuantity = 1;
		clientCode = 12345;
		
		rentBike rentBi  = new rentBikeImpl();
			
		try
		{
			Rent rent = new Rent();
			rent = rentBi.calculateRent(quantity, rentType, peopleQuantity, clientCode);
			
			System.out.println(rentType);
			System.out.println(rent.getLastname());
			System.out.println(rent.getName());
			System.out.println(rent.getRentAmount());
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		

	}

}
