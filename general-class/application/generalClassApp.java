package application;

import learn.CreateGeneralClass;

public class generalClassApp {
	public static void main(String[] args) {
		//Multiple General Class
		CreateGeneralClass<String, Double> createGeneralClass = new CreateGeneralClass<>("Pempek", 10000.0);

		System.out.println(createGeneralClass.getProduct());
		System.out.println(createGeneralClass.getPrice());
		
	}
}
