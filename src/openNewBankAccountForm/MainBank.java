package openNewBankAccountForm;

import java.util.Scanner;



public class MainBank {

	public static void main(String[] args) {
		int choice = 0;
		Scanner input = new Scanner(System.in);

		while (choice != 4) {
			System.out.println("Welcome to Online Bank !!");
			System.out.println("Choose your Account");
			System.out.println("1.Salary \n2.Current \n3.Savings \n4.Exit");
			while (choice < 1 || choice > 4) {
				choice = input.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println(
						"Instructions : \n Deposit and Withdraw just affects the balance with No trasanction Fees. \nIf the Account Balance drops below the required Threshold , there is a 5 rps fee charged at the end of the month , \n Minimum Amount - 50");
				int salaryAccountNumber = 1256056;
				System.out.println("Want to Create a Salary Account ?? Enter \nYour Name : ");
				String salaryAccountHolderName = input.next();
				System.out.println("Your initial amount of money : ");
				double salaryAccountAmount = input.nextDouble();

				SalaryAccount salaryAccount = new SalaryAccount(salaryAccountHolderName, salaryAccountNumber,
						salaryAccountAmount);

				while (choice != 5) {
					System.out.println(
							"Now do you want to \n1.Deposit \n2.Withdraw \n3.Display Current Balance \n4.Display Monthly Status \n5. Exit & CancelAccount");
					do {
						choice = input.nextInt();
					} while (choice < 1 || choice > 5);

					if (choice == 1) {
						System.out.println("Deposit Money : ");
						double moneyAmount = input.nextDouble();
						salaryAccount.deposit(moneyAmount);
					} else if (choice == 2) {
						System.out.println("Withdraw Money : ");
						double moneyAmount = input.nextDouble();
						salaryAccount.withdraw(moneyAmount);
					} else if (choice == 3) {
						System.out.println("Display Account Balance : " + salaryAccount.getBalance());
					} else if (choice == 4) {
						System.out.println("One Month Completed :");
						salaryAccount.endMonth();
					}

				}

				break;
			case 2:
				System.out.println(
						"Instructions : \n Deposit and Withdraw just affects the balance with No trasanction Fees. \nIf the Account Balance drops below the required Threshold , there is a 5 rps fee charged at the end of the month , \n Minimum Amount - 50");
				int currentAccountNumber = 2256056;
				System.out.println("Want to Create a Current Account ?? Enter \n.Your Name : ");
				String currentAccountHolderName = input.nextLine();
				System.out.println("Your initial amount of money : ");
				double currentAccountAmount = input.nextDouble();

				CurrentAccount currentAccount = new CurrentAccount(currentAccountHolderName, currentAccountNumber,
						currentAccountAmount);

				while (choice != 5) {
					System.out.println(
							"Now do you want to \n1.Deposit \n2.Withdraw \n3.Display Current Balance \n4.Display Monthly Status \n5. Exit & CancelAccount");
					do {
						choice = input.nextInt();
					} while (choice < 1 || choice > 5);

					if (choice == 1) {
						System.out.println("Deposit Money : ");
						double moneyAmount = input.nextDouble();
						currentAccount.deposit(moneyAmount);
					} else if (choice == 2) {
						System.out.println("Withdraw Money : ");
						double moneyAmount = input.nextDouble();
						currentAccount.withdraw(moneyAmount);
					} else if (choice == 3) {
						System.out.println("Display Account Balance : " + currentAccount.getBalance());
					} else if (choice == 4) {
						System.out.println("One Month Completed :");
						currentAccount.endMonth();
					}

				}

				break;
			case 3:
				System.out.println(
						"Instructions : \n Deposit and Withdraw just affects the balance with No trasanction Fees. \nIf the Account Balance drops below the required Threshold , there is a 5 rps fee charged at the end of the month , \n Minimum Amount - 50");
				int savingAccountNumber = 3256056;
				System.out.println("Want to Create a Savings Account ?? Enter \n.Your Name : ");
				String savingAccountHolderName = input.nextLine();
				System.out.println("Your initial amount of money : ");
				double savingAccountAmount = input.nextDouble();

				SavingAccount savingAccount = new SavingAccount(savingAccountHolderName, savingAccountNumber,
						savingAccountAmount);

				while (choice != 5) {
					System.out.println(
							"Now do you want to \n1.Deposit \n2.Withdraw \n3.Display Current Balance \n4.Display Monthly Status \n5. Exit & CancelAccount");
					do {
						choice = input.nextInt();
					} while (choice < 1 || choice > 5);

					if (choice == 1) {
						System.out.println("Deposit Money : ");
						double moneyAmount = input.nextDouble();
						savingAccount.deposit(moneyAmount);
					} else if (choice == 2) {
						System.out.println("Withdraw Money : ");
						double moneyAmount = input.nextDouble();
						savingAccount.withdraw(moneyAmount);
					} else if (choice == 3) {
						System.out.println("Display Account Balance : " + savingAccount.getBalance());
					} else if (choice == 4) {
						System.out.println("One Month Completed :");
						savingAccount.endMonth();
					}

				}

				break;

			default:
				break;
			}
		}
		input.close();
	}

}
