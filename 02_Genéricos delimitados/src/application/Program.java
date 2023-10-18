package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entites.Produto;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Produto> list = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			String line = bufferedReader.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				
				list.add(new Produto(fields[0], Double.parseDouble(fields[1])));
				
				line = bufferedReader.readLine();
			}
			
			Produto produtoMaisCaro = CalculationService.max(list);
			
			System.out.println("Mais caro:");
			System.out.println(produtoMaisCaro);
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
}
