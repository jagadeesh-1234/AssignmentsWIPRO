package com.spring.SpringSetterInjection;

public class Customer {

	private String name;
	public double bill;

	public String getName() {
		return name;
	}
		

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public double getBill() {
		return bill;
	}


	public void setBill(double bill) {
		this.bill = bill;
	}


	public void display() {
		System.out.println("Customer name is" +" "+name +" "+ "and bill amount is"+" " + bill);
		
	}
}
