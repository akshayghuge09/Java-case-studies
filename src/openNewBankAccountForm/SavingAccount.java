package openNewBankAccountForm;

public class SavingAccount extends Account {

	public SavingAccount() {
	}

	public SavingAccount(String accountHolderName, int accountNumber, double currentBalance) {
		super(accountHolderName, accountNumber, currentBalance);
	}

	public void deposit(double amount) {
		super.addAmount(amount);
	}

	public void withdraw(double amount) {
		if (super.getBalance() - amount < 0.00)
			System.out.println("Insufficient Balance !!  Your Current Account Balance is :" + super.getBalance());
		else
			super.deductAmount(amount);
	}

	public void interest() {
		interest = (super.getBalance() * 5) / 100;
	}

}
