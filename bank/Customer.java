package bank;

public class Customer {
	private String name;
	private String address;
	Account account;
	
	public Customer(String name, String address, Account account) {
		super();
		this.name = name;
		this.address = address;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getBalance() {
		return account.getBalance();
	}
	
	public void withdraw(double amount) {
		account.withdraw(amount);
	}

	public void deposit(double amount) {
		account.deposit(amount);
	}
}
