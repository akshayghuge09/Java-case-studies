package bankAccountUsing_FactoryPattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) throws lowBalanceException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter maximum nunber of account that can be created by bank");
		int numberOfAcc = scanner.nextInt();
		Accounts[] account = new Accounts[numberOfAcc];
		String accountType;
		int choice = 0;
		int count = 0;
		boolean z = false;
		while (z != true) {
		
			try {

				do {
					System.out.println("*********SERVICES*********");
					System.out.println("PRESS 1. Open Account");
					System.out.println("PRESS 2. Deposit Money");
					System.out.println("PRESS 3. Withdraw money");
					System.out.println("PRESS 4. Calculate interest on available balance");
					System.out.println("PRESS 5. Display Account details ");
					System.out.println("PRESS 6. To delete account");
					System.out.println("PRESS 7. Exit ");
					System.out.println("\n\nEnter the choice :  ");
					

					choice = scanner.nextInt();

					switch (choice) {
					case 1:
						System.out.println("Whice account do you want to open");
						System.out.println(" Saving Account");
						System.out.println(" Current Account");
						System.out.println(" Salary Acount");
						System.out.println(" Loan Account");
						System.out.println(" Exit ");
						System.out.println("type the account type(saving,current,salary,loan ): ");
						String choiceAcc = scanner.next();
						accountType = choiceAcc;

						if (count < numberOfAcc) {

							account[count] = AccountFactory.getaccountObj(accountType);
							account[count].openAccount();
							count++;

						} else {

							System.out.println("Bank Acounts Limit is full");
						}

						break;
					case 2: {
						System.out.println("Enter the Account Number in which you have to deposit");

						int flag = 0;
						try {
						
							int accNumber = scanner.nextInt();

							for (int i = 0; i < count; i++) {
								if (accNumber == account[i].getAccountNumber()) {
									account[i].deposit();

									account[i].display();
									flag = 1;
								}
							}
							if (flag == 0) {
								System.out.println("Invalid Account Number");
							}
						} catch (InputMismatchException e) {
							System.out.println("enter correct no.");
							z = false;
						}
					}
						break;
					case 3: {
						System.out.println("Enter the Account Number in which you have to withdraw");

						int flag = 0;

						int accNumber = scanner.nextInt();
						for (int i = 0; i < count; i++) {
							if (accNumber == account[i].getAccountNumber()) {
								account[i].withdraw();

								account[i].display();
								flag = 1;
							}
						}
						if (flag == 0) {
							System.out.println("Invalid Account Number");
						}

					}
						break;
					case 4: {
						System.out.println("Enter the Account Number in which you have to calculate interest");

						int flag = 0;

						int accNumber = scanner.nextInt();
						for (int i = 0; i < count; i++) {
							if (accNumber == account[i].getAccountNumber()) {
								account[i].calInterset();

								flag = 1;
							}
						}
						if (flag == 0) {
							System.out.println("Invalid Account Number");
						}

					}
						break;
					case 5: {
						System.out.println("Enter the account number and display the details");

						int flag = 0;

						int accNumber = scanner.nextInt();
						for (int i = 0; i < count; i++) {
							if (accNumber == account[i].getAccountNumber()) {

								account[i].display();
								flag = 1;
							}
						}
						if (flag == 0) {
							System.out.println("Invalid Account Number");
						}

					}
						break;
					case 6: {
						System.out.println("Enter the account number that you want to delete");

						int flag = 0;

						int accNumber = scanner.nextInt();
						for (int i = 0; i < count; i++) {
							if (accNumber == account[i].getAccountNumber()) {
								for (int j = i + 1; j < count; j++) {
									account[j - 1] = account[j];
								}
								flag = 1;
							}
							if (flag == 0) {
								System.out.println("Invalid Account Number");
							}

						}
						break;

					}
					default:
						System.out.println("Exit the application");
						break;

					}

				} while (choice != 7);
				z = true;
			} catch (InputMismatchException e) {
				System.err.println("numeric values only no Alphabets");
			} catch (NullPointerException e) {
				System.out.println("Enter name of account type");
			}
		}

		scanner.close();
	}
}
