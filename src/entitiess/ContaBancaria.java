package entitiess;

public class ContaBancaria {

	private int accountNumber;
	private String accountName;
	private double saldoDaConta;
	
	public ContaBancaria() {
		
	}
	
	public ContaBancaria(int accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	public ContaBancaria(int accontNumber, String accountName, double saldoDaConta) {
		this.accountNumber = accontNumber;
		this.accountName = accountName;
		deposito(saldoDaConta);
		
	}
	
	public int getAccountNumer() {
		return accountNumber;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public double getSaldoDaConta() {
		return saldoDaConta;
	}
	
	public void saque(double amount) {
		this.saldoDaConta -= (amount + 5);
	}
	
	public void deposito(double amount) {
		this.saldoDaConta += amount;
	}
	
	public String toString() {
		return "Account " 
				+ this.accountNumber
				+ ", Holder: "
				+ this.accountName
				+ ", Balance: $ "
				+ String.format("%.2f", this.saldoDaConta);
	}
}
