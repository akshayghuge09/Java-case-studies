package bankAccountUsing_FactoryPattern;

import java.time.LocalDate;

public abstract class Accounts {
	protected String accountHolderName;
	protected int accountNumber;
	protected double balance;
	protected int transactionNumber;
	protected double bankFee;
	protected double interestRate;
	LocalDate open_date;
	
	public Accounts() {
		this.accountHolderName=null;
		this.accountNumber=0;
		this.balance=0;
		this.bankFee=0;
		this.interestRate=0.05;
		this.transactionNumber=0;
		
		
	}

	
	
	public Accounts(String accountHolderName, int accountNumber, double balance, int transactionNumber, double bankFee, LocalDate open_date)
	{
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.transactionNumber = transactionNumber;
		this.bankFee = bankFee;
		this.open_date = open_date;
	}



	public String getAccountHolderName() {
		return accountHolderName;
	}



	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public int getTransactionNumber() {
		return transactionNumber;
	}



	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}



	public double getBankFee() {
		return bankFee;
	}



	public void setBankFee(double bankFee) {
		this.bankFee = bankFee;
	}



	public double getInterest() {
		return interestRate;
	}



	public void setInterest(double interest) {
		this.interestRate = interest;
	}



	public LocalDate getOpen_date() {
		return open_date;
	}



	public void setOpen_date(LocalDate open_date) {
		this.open_date = open_date;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}

	public abstract void openAccount();

	public abstract void deposit();
	
	public abstract void withdraw() throws lowBalanceException;
	
	public abstract void  calInterset();
	
	public abstract void display();
	
	
	

	
	/*
	 * public void monthReport() {
	 * 
	 * System.out.println("Name:"+accountHolderName);
	 * System.out.println("acc No.:"+accountNumber);
	 * System.out.println("***Your monthly transaction Report***");
	 * System.out.println("Total transaction :"+transactionNumber);
	 * System.out.println("Bank charges : "+bankFee);
	 * System.out.println("Interest : "+interest);
	 * System.out.println("Available Balance :"+(getbalance()+interest));
	 * 
	 * System.out.println("*******Thank You********");
	 * 
	 * }
	 */

}
