package application;

import entites.Client;

public class EqualsHashcodeTest {

	public static void main(String[] args) {

		Client client = new Client("Maria", "maria@gmail.com");
		Client client2 = new Client("Maria", "maria@gmail.com");
		
		System.out.println(client.hashCode());
		System.out.println(client2.hashCode());
		System.out.println(client.equals(client2));
		System.out.println(client == client2);
		
	}

}
