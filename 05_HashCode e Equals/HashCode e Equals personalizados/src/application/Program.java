package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		Client client1 = new Client("Maria", "maria@gmail.com");
		Client client2 = new Client("Maria", "maria@gmail.com");
		
		String string1 = "Test";
		String string2 = "Test";
		
		String string3 = new String("Test");
		String string4 = new String("Test");
		
		System.out.println(client1.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client1.equals(client2));
		System.out.println(client1 == client2);
		System.out.println(string1 == string2);
		System.out.println(string3 == string4);
	}

}
