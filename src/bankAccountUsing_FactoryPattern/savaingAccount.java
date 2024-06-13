package bankAccountUsing_FactoryPattern;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class savaingAccount extends Accounts {

	Scanner scanner = new Scanner(System.in);

	public savaingAccount() {
		super();
		this.interestRate = 0.03;
	}

	@Override
	public void openAccount() {
		boolean x = false;
		while (x != true) {
			try {

				System.out.println("To open saving account fill following details");
				System.out.println("*******************************************************************");
				System.out.println("Enter account number :");
				int accNum = scanner.nextInt();
				System.out.println("Enter your name : ");
				String Name = scanner.next();
				System.out.println("Enter the account opening amount");
				double amount = scanner.nextDouble();

				this.accountNumber = accNum;
				this.accountHolderName = Name;
				this.balance = amount;

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
				//Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the deposit amount");
				double amount = scanner.nextDouble();
				x = true;
				balance = balance + amount;
				transactionNumber++;
				System.out.println("Available bal: " + balance);
				break;
			} catch (InputMismatchException e) {
				System.out.println("Enters correct amount");
			}
		}

	}

	@Override
	public void withdraw() throws lowBalanceException {
		boolean x = false;
		while (x != true) {
			try {
			//	Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the withdraw amount");
				double withdrawAmount = scanner.nextDouble();
				x = true;
				double tempBalance = balance - withdrawAmount;
				if (balance > withdrawAmount) {
					if (tempBalance > 10000) {
						balance = balance - withdrawAmount;
						System.out.println("Available bal: " + balance);
						transactionNumber++;
					} else {
						System.out.println("transaction failed \nminimum balance should be 10000");

					}
				} else {
					throw new lowBalanceException();
				}
			} catch (InputMismatchException e) {
				System.out.println("Enters correct amount");
			} catch (lowBalanceException e) {
				System.out.println("you have insufficient balance");
			}
		}

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
		System.out.println("Interest rate on saving account  : " + this.interestRate);
		System.out.println("Available Balance :" + this.balance);
		System.out.println("Account opening date :" + this.open_date);

		System.out.println("*******Thank You********");

	}

}
