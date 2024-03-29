package entities;

public class Product1 {
	// Aula 56 Construtor
	/* 
	public String name;
	public double price;
	public int quantity;
	*/
	// Aula 59 Encapsulamento
	private String name;
	private double price;
	private int quantity;
	// Construtor:
	public Product1(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// Aula 58 sobrecarga
	public Product1(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Aula 58 Construtor Padr�o
	public Product1() {
		
	}
	// Aula 59 Encapsulamento Get e Set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	// At� aqui aula 59 
	
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
		return name 
				+ ", $ " 
				+ String.format("%.2f", price)
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());

	}
}
