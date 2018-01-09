package com.shop.bill;

import com.shop.pm.PriceMatrixImpl_v1;

/*
 * 
 *  design & performance issues
 *  -----------------------------
 *  
 *   ==> tight-coupling b/w dependent & dependncy objects
 *   
 *       --> Maintenance issues , can't extend with new features
 *      
 *   ==> too many duplicate dependencies are created & destructed..
 *   
 *       --> slow, memory use high , .... 
 *   
 *   ==> Unit-Testing not possible
 *   
 *       --> dev/bug-fix slow 
 * 
 * 
 *   why these issues are raising here ?
 *   
 *   ==> dependent creating its own dependency
 *   
 *   soln :
 *   
 *   ==> don't create , do Lookup
 *   
 *   problems with lookup:
 *   
 *   ==> location tight-coupling
 *   
 *   best soln : 
 *   
 *     ==> dont create/lookup , inject thru 'some-one' ( IOC  ( Inversion of Control )
 *     
 *     How to implement IOC ?
 *     
 *     ==> thru 'Dependency Injection' ( DI )
 *     
 *        types of DI
 *        
 *        ==> constructor DI
 *        ==> setter DI
 *        
 *    --------------------------------------------------------
 *    
 *      S — Single responsibility principle
		O — Open for extension & closed for modification principle
		L — Liskov substitution principle
		I — Interface segregation principle
		D — Dependency Inversion principle
 * 
 */

public class BillingImpl {

	private PriceMatrixImpl_v1 priceMatrix;

	public double getTotalPrice(String[] cart) {
		double total = 0.0;
		priceMatrix = new PriceMatrixImpl_v1();
		for (String item : cart) {
			total += priceMatrix.getPrice(item);
		}
		return total;
	}

}
