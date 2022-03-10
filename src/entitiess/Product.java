package entitiess;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public Product() { //Obs: se você criar construtores, você pode criar um construtor padrão
						//para caso você instancie um objeto, não seja obrigado a passar os parâmetros.
		
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return   name 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", "
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
