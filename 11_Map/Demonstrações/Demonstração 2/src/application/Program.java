package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Map<Product, Double> stock = new HashMap<>();
		
		Product product1 = new Product("Tv", 900.0);
		Product product2 = new Product("Notebook", 1200.0);
		Product product3 = new Product("Tablet", 400.0);
		
		stock.put(product1, 10000.0);
		stock.put(product2, 20000.0);
		stock.put(product3, 15000.0);
		
		Product productStock = new Product("Tv", 900.0);
		
		System.out.println("Contains 'productStock' key: " + stock.containsKey(productStock));
	}

}
