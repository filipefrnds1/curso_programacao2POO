package curso_programacao2POO;

import java.util.Locale;
import java.util.Scanner;

import entitiess.ContaBancaria;

public class BancoF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaBancaria cont;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int num = sc.nextInt();
				
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)?");
		//sc.nextLine();
		char ot = sc.next().charAt(0);
		//String ot = sc.nextLine();
		
		if(ot == 'y') {
			System.out.print("Enter initial deposit value: ");
			double saldo = sc.nextDouble();
			cont = new ContaBancaria(num,name,saldo);
		}else {
			cont = new ContaBancaria(num,name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(cont);
		
		System.out.print("Enter a deposit value: ");
		double dep = sc.nextDouble();
		cont.deposito(dep);
		System.out.println("Update account data: ");
		System.out.println(cont);
		
		System.out.print("Enter a withdraw value: ");
		double saq = sc.nextDouble();
		cont.saque(saq);
		System.out.println(cont);
		
		
		
		
		
		
		
		sc.close();
	}

}
