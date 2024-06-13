package bankAccountUsing_FactoryPattern;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class loanAccount extends savaingAccount {

	double repay;
	Scanner scanner = new Scanner(System.in);

	public loanAccount() {
		this.repay = 0;
		this.interestRate = 0.7;
	}

	public double getRepay() {
		return repay;
	}

	public void setRepay(double repay) {
		this.repay = repay;
	}

	public void openAccount() {
		boolean x = false;
		while (x != true) {
			try {

				System.out.println("To open loan account fill following details");
				System.out.println("*******************************************************************");
				System.out.println("Enter account number :");
				int accNum = scanner.nextInt();
				System.out.println("Enter your name : ");
				String Name = scanner.next();
				System.out.println("Enter the first repay amount");
				double amount = scanner.nextDouble();
				this.accountNumber = accNum;
				this.accountHolderName = Name;
				this.balance = amount + this.repay;

				this.open_date = LocalDate.now();
				System.out.println("********************************************************************");
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters numbers only");
			}
		}
	}

	@Override
	public void deposit() {
		boolean x = false;
		while (x != true) {
			try {
			//	Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the deposit amount");
				double amount = scanner.nextDouble();
				balance = balance + amount;
				this.repay = amount;
				transactionNumber++;
				System.out.println("Available bal: " + balance);
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters the correct amount in digits only");
			}
		}
	}

	@Override
	public void withdraw() {
		System.out.println("you can not withdraw as this is laon account");
	}

	@Override
	public void calInterset() {
		double interest = this.balance * this.interestRate;
		System.out.println("Interest on savaing account balance :\t" + interest);

	}

	@Override
	public void display() {
		System.out.println("Mr./Mrs/Miss \t" + this.accountHolderName);
		System.out.println("acc No.:" + this.accountNumber);
		System.out.println("Total transaction :" + this.transactionNumber);
		System.out.println("Interest rate on your loan is  : " + this.interestRate);
		System.out.println("Repay amount : " + this.repay);
		System.out.println("Available Balance :" + this.balance);
		System.out.println("Account opening date :" + this.open_date);

		System.out.println("*******Thank You********");

	}
}
