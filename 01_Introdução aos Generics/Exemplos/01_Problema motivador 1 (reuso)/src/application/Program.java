package application;

import java.util.Scanner;

import services.PrintServiceString;

public class Program {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PrintServiceString printServiceString = new PrintServiceString();
		
		System.out.print("How many values? ");
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			String value = scanner.next();
			printServiceString.addValue(value);
		}
		
		printServiceString.print();
		System.out.println("First: " + printServiceString.first());
		
		scanner.close();
	}

}
