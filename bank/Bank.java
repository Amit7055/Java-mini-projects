package bank;

public class Bank {
	Account[] accounts;
	Customer[] customers;
	private final String NAME = "SBI";
	static double interestRate = 5;
	static final int MAX = 10;
	static int maxWithdrawLimit = 0;
	static int maxDepositLimit = 0;
	static int accSize = 10;
	private int size;

	public Bank() {
		customers = new Customer[accSize];
		accounts = new Account[accSize];
		size = 0;
	}

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(double interestRate) {
		Bank.interestRate = interestRate;
	}

	public void addAccount(String name, String address, double balance) {
		if (size < customers.length) {
			accounts[size] = new Account(balance);
			customers[size] = new Customer(name, address, accounts[size]);
			size++;
		}
	}

	public void removeAccount(String AccNo) {
		for (int i = 0; i < size; i++) {
			if (customers[i].account.getAccountNumber().equals(AccNo)) {
				for (int j = i; j < size - 1; j++) {
					customers[i] = customers[i + 1];
					accounts[i] = accounts[i + 1];
				}
				customers[size] = null;
				accounts[size] = null;
				size--;
				break;
			}
		}
		
	}

	public void withdraw(String AccNo, double amount) {
		if (0 >= amount) {
			System.out.println("Invalid amount");
		} else {
			for (int i = 0; i < size; i++) {
				if (customers[i].account.getAccountNumber().equals(AccNo)) {
					if (customers[i].account.getBalance() <= amount) {
						System.out.println("Insufficient Funds...");
						break;
					} else {
						customers[i].withdraw(amount);
						System.out.println("Withdraw Successfull...");
						break;
					}
				}
			}
		}
	}

	public void deposit(String AccNo, double amount) {
		if (0 >= amount) {
			System.out.println("Invalid amount");
		} else {
			for (int i = 0; i < size; i++) {
				if (customers[i].account.getAccountNumber().equals(AccNo)) {
					customers[i].deposit(amount);
					System.out.println("Deposit Successfull...");
					break;
				}
			}
		}
	}

	public void addInterest() {
		double interest = interestRate / 100;
		double newBalance;
		for (int i = 0; i < size; i++) {
			newBalance = customers[i].account.getBalance() * interest;
			customers[i].account.setBalance(newBalance + customers[i].account.getBalance());
		}
		System.out.println("Apply Interest Successfull...");
	}

	public void transfer(String AccNo1, String AccNo2, double amount) {
		boolean test = false;
		boolean test2 = false;
		if (amount <= 0) {
			System.out.println("Invalid amount");
		} else {
			for (int i = 0; i < size; i++) {
				if (customers[i].account.getAccountNumber().equals(AccNo1)
						&& customers[i].account.getBalance() > amount) {
					customers[i].account.withdraw(amount);
					test = true;
				}
			}
			if (test == true) {
				for (int i = 0; i < size; i++) {
					if (customers[i].account.getAccountNumber().equals(AccNo2)) {
						customers[i].account.deposit(amount);
						test2 = true;
					}
				}
			}
		}
		if (test == false || test2 == false) {
			System.out.println("Invalid account number");
		}
	}

	public void allCustomerDisplay() {
		for (int i = 0; i < size; i++) {
			System.out.println("Bank Name : " + NAME);
			System.out.println("Account No : " + customers[i].account.getAccountNumber());
			System.out.println("Customer Name : " + customers[i].getName());
			System.out.println("Address : " + customers[i].getAddress());
			System.out.println("Balance : " + customers[i].getBalance());
			System.out.println("Total number of withdraw : " + NAME);
			System.out.println("Total number of deposit : " + NAME);
		}
	}

}
