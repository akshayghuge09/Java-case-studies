package bankAccountUsing_FactoryPattern;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class salaryAccount extends savaingAccount {

	double salary;
	LocalDate transactionDate;
	Scanner scanner = new Scanner(System.in);

	public salaryAccount() {
		super();
		this.interestRate = 0.04;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public void openAccount() {
		boolean x = false;
		while (x != true) {
			try {

				System.out.println("To open salary account fill following details");
				System.out.println("*******************************************************************");
				System.out.println("Enter account number :");
				int accNum = scanner.nextInt();
				System.out.println("Enter your name : ");
				String Name = scanner.next();
				System.out.println("Enter the account opening amount");
				double amount = scanner.nextDouble();
				System.out.println("Enter the salary amount");
				double sal = scanner.nextDouble();
				this.salary = sal;

				this.accountNumber = accNum;
				this.accountHolderName = Name;
				this.balance = amount + this.salary;

				this.open_date = LocalDate.now();
				System.out.println("********************************************************************");
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters numbers only");
			}
		}

	}

	public void deposit() {
		boolean x = false;
		while (x != true) {
			try {
				//Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the deposit amount");
				double amount = scanner.nextDouble();
				balance = balance + amount;
				transactionNumber++;
				System.out.println("Available bal: " + balance);
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters correct amount");
			}
		}
	}

	@Override
	public void withdraw() {
		boolean x = false;
		while (x != true) {
			try {
				//Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the withdraw amount");
				double withdrawAmount = scanner.nextDouble();
				if (balance > withdrawAmount) {

					balance = balance - withdrawAmount;
					System.out.println("Available bal: " + balance);
					transactionNumber++;

				} else {
					throw new lowBalanceException();
				}
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters correct amount");
			} catch (lowBalanceException e) {
				System.out.println("you have insufficient balance");
			}
		}

	}

	public void calInterset() {
		double interest = this.balance * this.interestRate;
		System.out.println("Interest on savaing account balance :\t" + interest);

	}

	@Override
	public void display() {
		System.out.println("Mr./Mrs/Miss \t" + this.accountHolderName);
		System.out.println("acc No.:" + this.accountNumber);
		System.out.println("Total transaction :" + this.transactionNumber);
		System.out.println("Interest rate on saving account  : " + this.interestRate);
		System.out.println("Salary of one month :" + this.salary);
		System.out.println("Available Balance :" + this.balance);
		System.out.println("Account opening date :" + this.open_date);

		System.out.println("*******Thank You********");

	}

}
