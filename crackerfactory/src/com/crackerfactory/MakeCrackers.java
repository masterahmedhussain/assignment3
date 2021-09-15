package com.crackerfactory;

public class MakeCrackers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Worker worker = new Worker();
			Manager manager= new Manager();
			Customer customer = new Customer(manager);
			customer.createOrder(new StartOrder(worker));
			customer.hungry();
		}

	

}
