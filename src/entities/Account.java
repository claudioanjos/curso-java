package entities;

public class Account {
	
	private String holder;
	private int number;
	private double value;
	
	public Account(String holder, int number, double initialDeposit) {
		super();
		this.holder = holder;
		this.number = number;
		deposit(initialDeposit);
	}
	
	public Account(String holder, int number) {
		super();
		this.holder = holder;
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getValue() {
		return value;
	}
	
	public void deposit(double amount) {
		this.value += amount;
	}
	
	public void withdraw(double amount) {
		this.value -= amount + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", value);
	}

}
