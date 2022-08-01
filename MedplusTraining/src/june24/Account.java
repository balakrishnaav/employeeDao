package june24;

public class Account {
	protected String customerName;
	protected int accountNumber;
	protected double balance;
	public Account(String customerName, int accountNumber, double balance) {
		
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
