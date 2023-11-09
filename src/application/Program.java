package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		Aluguel [] hotel = new Aluguel[10];
		
		System.out.print("Quantos quartos serão alugados ? ");
		int n = t.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Aluguel #" + i +":");
			System.out.print("Nome: ");
			t.nextLine();
			String nome = t.nextLine();
			System.out.print("E-mail: ");
			String email = t.nextLine();
			System.out.println("Quarto: ");
			int quarto = t.nextInt();
			
			hotel[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(hotel[i] != null) {
				System.out.println(i + ": "+ hotel[i]);
			}
		}
		
	}

}
