package application;

import java.util.Scanner;

import services.PrintService;

public class Program {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PrintService<Integer> printService = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = scanner.nextInt();
		
		// printService.addValue("Maria");
		
		for (int i = 0; i < n; i++) {
			Integer value = scanner.nextInt();
			printService.addValue(value);
		}
		
		printService.print();
		
		Integer x = printService.first();
		
		System.out.println("First: " + x);
		
		scanner.close();
	}

}
