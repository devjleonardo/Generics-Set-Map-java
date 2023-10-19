package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Map<String, Integer> votos = new LinkedHashMap<>();
		
		System.out.print("Enter file full path: ");
		String path = scanner.nextLine();
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String linha = bufferedReader.readLine();
			
			while (linha != null) {
				String[] fields = linha.split(",");
				String nome = fields[0];
				int quantidade = Integer.parseInt(fields[1]);
				
				if (votos.containsKey(nome)) {
					int votosAtuais = votos.get(nome);
					votos.put(nome, quantidade + votosAtuais);
				} else {
					votos.put(nome, quantidade);
				}
				
				linha = bufferedReader.readLine();
			}
			
			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		scanner.close();
	}
	
}
