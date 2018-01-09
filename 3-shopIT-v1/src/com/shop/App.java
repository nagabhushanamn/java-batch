package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billingComp = new BillingImpl();

		// use
		String[] cart = { "345678", "3456789" };
		double totalPrice = billingComp.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);

		// destroy
		// ...

	}

}
