package bankAccountUsing_FactoryPattern;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class currentAcount extends Accounts {

	double overDraftLimit;
	double overDraft;
	Scanner scanner = new Scanner(System.in);

	public currentAcount() {
		super();
		this.interestRate = 0.6;
	}

	public currentAcount(String accountHolderName, int accountNumber, double balance, int transactionNumber,
			double bankFee, LocalDate open_date) {
		super(accountHolderName, accountNumber, balance, transactionNumber, bankFee, open_date);

	}

	// Scanner scanner = new Scanner(System.in);

	@Override
	public void openAccount() {
		boolean x = false;
		while (x != true) {
			try {

				System.out.println("To open current account fill following details");
				System.out.println("*******************************************************************");
				System.out.println("Enter account number :");
				int accNum = scanner.nextInt();
				System.out.println("Enter your name : ");
				String Name = scanner.next();
				System.out.println("Enter the account opening amount");
				double amount = scanner.nextDouble();
				System.out.println("Set your over draft limit");
				double odLimit = scanner.nextDouble();
				System.out.println("Enter the amount which over drafted");
				double od = scanner.nextDouble();

				this.accountNumber = accNum;
				this.accountHolderName = Name;
				this.balance = amount;
				this.overDraft = od;
				this.overDraftLimit = odLimit;
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
				// Scanner scanner = new Scanner(System.in);

				System.out.println("Enter the deposit amount");
				double amount = scanner.nextDouble();
				balance = balance + amount;
				transactionNumber++;
				System.out.println("Available bal: " + balance);
				x = true;
			} catch (InputMismatchException e) {
				System.out.println("Enters numbers only");
			}
		}

	}

	@Override
	public void withdraw() {
		boolean x = false;
		while (x != true) {
			try {
				// Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the withdraw amount");
				double withdrawAmount = scanner.nextDouble();
				double tempBalance = this.balance + this.overDraftLimit;
				if (withdrawAmount < tempBalance) {
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
		System.out.println("over draft limit :" + this.overDraftLimit);
		System.out.println("Available Balance :" + this.balance);
		System.out.println("Account opening date :" + this.open_date);

		System.out.println("*******Thank You********");
	}

}
