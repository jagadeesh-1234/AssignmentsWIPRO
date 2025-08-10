package com.spring.SpringSetterInjection;

public class Order {
		private Customer customer;
		
		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		
		public void showOrderDetails() {
			System.out.println("Order placed by" + " "+getCustomer().getName()+ " "+"and amount is" + " "+getCustomer().getBill());
			customer.display();
		}
		
		
}
