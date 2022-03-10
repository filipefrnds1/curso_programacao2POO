package entitiess;

public class Product {
	
	public String name;
	public double price;
	public Integer quantity;
	
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
		return "Update Data: " + name + ", $" 
				+ String.format("%.2f", price) + ", "
				+ quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
