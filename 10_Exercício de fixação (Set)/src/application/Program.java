package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int code = scanner.nextInt();
			courseA.add(code);
		}
		
		System.out.print("How many students for course B? ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int code = scanner.nextInt();
			courseB.add(code);
		}

		System.out.print("How many students for course C? ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int code = scanner.nextInt();
			courseC.add(code);
		}

		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("Total students: " + total.size());
		
		scanner.close();
	}

}
