package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente cli;

		System.out.print("Enter account number:");
		int numConta = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);

		if (answer == 'y') {
			System.out.println("Enter initial deposit value: ");
			double valor = sc.nextDouble();
			cli = new Cliente(numConta, nomeTitular, valor);

		} else {
			cli = new Cliente(numConta, nomeTitular);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cli);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valor = sc.nextDouble();
		cli.deposito(valor);
		System.out.print("Updated account data: ");
		System.out.println(cli);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		cli.saque(valor);
		System.out.print("Updated account data: ");
		System.out.println(cli);


		sc.close();

	}

}
