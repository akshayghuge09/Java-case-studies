package openNewBankAccountForm;

public abstract class Account {

	private String accountHolderName;
	private int accountNumber;
	private double currentBalance;
	private int transactionNumber;
	private double bankFee;
	protected double interest;

	public Account() {
	}

	public Account(String accountHolderName, int accountNumber, double currentBalance) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.currentBalance = currentBalance;
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public void addAmount(double amount) {
		this.currentBalance += amount; // this.currentBalance=this.currentBalance+amount;
		this.transactionNumber++;
	}

	public void deductAmount(double amount) {
		this.currentBalance -= amount; // this.currentBalance=this.currentBalance-amount;
		this.transactionNumber++;
	}

	public void addBankFee(double amount) {
		bankFee += amount;
	}

	public double getBalance() {
		return this.currentBalance;
	}

	public void endMonth() {
		System.out.println("Hello !! Dear " + this.accountHolderName);
		System.out.println("with Account Number --> " + this.accountNumber);
		System.out.println(" Your monthly status given below :- ");
		System.out.println("Total Transaction: " + transactionNumber);
		System.out.println("Bank Fee : " + bankFee);
		System.out.println("Interest :" + interest);
		System.out.println("Total balance : " + (getBalance() + interest));
	}

}
