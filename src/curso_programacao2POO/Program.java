package curso_programacao2POO;

import java.util.Locale;
import java.util.Scanner;

import entitiess.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product prod = new Product();
		
		System.out.println("Enteder product data: ");
		System.out.print("Name: ");
		prod.name = sc.nextLine();
		
		System.out.print("Price: ");
		prod.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		prod.quantity = sc.nextInt();
		
		System.out.println("Product data: " + prod.name + ", $ " + prod.price +
				", " + prod.quantity + "units, Total: $ " + prod.totalValueInStock());
		
		System.out.print("Enter the new number of products to be added in stock: ");
			int num1 = sc.nextInt();
			prod.addProducts(num1);
			
		System.out.println(prod);
		//System.out.println("Product data: " + prod.name + ", $ " + prod.price +
		//		", " + prod.quantity + "units, Total: $ " + prod.totalValueInStock());
		
		System.out.print("Enter the new number of products to be removed from stock: ");
			int num2 = sc.nextInt();
			prod.removeProducts(num2);
		
		System.out.println(prod);
		//System.out.println("Product data: " + prod.name + ", $ " + prod.price +
		//		", " + prod.quantity + "units, Total: $ " + prod.totalValueInStock());
		
		sc.close();
	}

}
