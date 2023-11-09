package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		//Programa que simula uma pensão para estudantes, onde 15 quartos poderão ser alugados.
		//Temos um vetor 'hotel' que guardará os dados dos alunos que quiseram alugar.
		//E no fim, mostra os quartos alugados em ordem, junto com os dados dos clientes.
		
		Locale.setDefault(Locale.US);
		Scanner t = new Scanner(System.in);
		
		Aluguel [] hotel = new Aluguel[15];
		
		System.out.print("Quantos quartos serão alugados ? ");
		int n = t.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Aluguel #" + i +":");
			System.out.print("Nome: ");
			t.nextLine();
			String nome = t.nextLine();
			System.out.print("E-mail: ");
			String email = t.nextLine();
			System.out.print("Quarto: ");
			int quarto = t.nextInt();
			
			Aluguel aluguel = new Aluguel(nome, email);
			
			hotel[quarto] = aluguel;
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < 15; i++) {
			if(hotel[i] != null) {
				System.out.println(i + ": "+ hotel[i]);
			}
		}
		
	}

}
