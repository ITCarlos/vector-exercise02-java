package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];
		System.out.print("How many rooms will be rented? ");
		int n = input.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Rent " + i + "#");
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int room = input.nextInt();
			
			vect[room] = new Rent(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 1; i < 10; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			}
		}
		
		input.close();
	}

}
