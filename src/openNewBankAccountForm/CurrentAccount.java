package openNewBankAccountForm;

public class CurrentAccount extends Account {

	public CurrentAccount() {
	}

	public CurrentAccount(String accountHolderName, int accountNumber, double currentBalance) {
		super(accountHolderName, accountNumber, currentBalance);
	}

	public void deposit(double amount) {
		super.addAmount(amount);
	}

	public void withdraw(double amount) {
		if (super.getBalance() - amount < 0.00)
			System.out.println("Insufficient Balance !!  Your Current Account Balance is :" + super.getBalance());
		else {
			super.deductAmount(amount);
			// if (super.getBalance() < 50.00)
			super.addBankFee(0.50);

		}

	}

}
