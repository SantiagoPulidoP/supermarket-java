package com.sp.mybusiness;

import java.util.ArrayList;
import java.util.List;

public class Initializer {
	public static List<Product> productList = new ArrayList<Product>();

	
	public static List<Product> defaultData() {
		Product arroz = new Product("Arroz",1000,5);
		Product cocacola = new Product("CocaCola",1500,100);
		Product chicles = new Product("Chicles",200,100);
		
		productList.add(arroz);
		productList.add(cocacola);
		productList.add(chicles);
		
		return productList;

		
		
		
	}
	
	
}
