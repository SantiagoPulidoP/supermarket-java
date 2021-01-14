package com.sp.mybusiness;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Runner {

	private static List<Product> productList = Initializer.defaultData();
	
	
	public static void main(String[] args) {
		System.out.println("Bienvenido");
		ArrayList<Product> products = new ArrayList<Product>(); 
		showMenu();
	}
	
	
	public static void showMenu() {
		Scanner scanner = new Scanner(System.in);
		int exit = 0;
	
		do {
			System.out.println("Welcome to My Supermarket");
			System.out.println("Please Select an option: ");
			System.out.println(" 1. Add New Product");
			System.out.println(" 2. List of products");
			System.out.println(" 3. Sell products");
			System.out.println(" 0. Exit");
			exit = scanner.nextInt();
			
			switch (exit) {
				case 0:
					exitOption();
					exit = 0;
					break;
				case 1:
					addNewProduct();
						break;
				case 2:
					listProducts();
					break;
				case 3:
					sellProduct();
					break;
				default:
					System.out.println();
					System.out.println("....Selecciona una opción!!....");
					System.out.println();
					break;
				
			}
			
		}while(exit!=0);
		
	}
	
	public static void exitOption() {
		System.out.println("Thanks for visiting us");
	}
	
	public static void addNewProduct() {
		System.out.println("Please enter the product name: ");
		Scanner nameScaner = new Scanner(System.in);
		String productName = nameScaner.nextLine();
		
		System.out.println("Please enter product price: ");
		Scanner priceScaner = new Scanner(System.in);
		double productPrice = priceScaner.nextDouble();
		
		System.out.println("Please enter product amount: ");
		Scanner amountScaner = new Scanner(System.in);
		int productAmount = amountScaner.nextInt();
		
		productList.add(new Product(productName, productPrice,productAmount));
		
		

	}
	
	public static void listProducts() {
		System.out.println("Lista de productos");
		
		for (Product product : productList) {
			System.out.println(product.getName());
		}
	}
	
	public static void sellProduct() {
		System.out.println("VEnta de productos");
	}

}













