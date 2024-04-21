package bank;

public class Account {
	private String accountNumber;
	private double balance;
	static int accNo = 1000;

	public Account(double balance) {
		this.accountNumber = "39000" + accNo++;
		this.balance = balance;
	}

	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
