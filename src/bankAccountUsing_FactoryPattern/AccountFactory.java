package bankAccountUsing_FactoryPattern;

public class AccountFactory {
	
	public static Accounts getaccountObj(String accountType)
	{
		if(accountType.trim().equalsIgnoreCase("Saving"))
			return new savaingAccount();
		else if(accountType.trim().equalsIgnoreCase("Current"))
			return new currentAcount();
		else if(accountType.trim().equalsIgnoreCase("Salary"))
			return new salaryAccount();
		else if(accountType.trim().equalsIgnoreCase("Loan"))
			return new loanAccount();
		else
			
		return null;
		
	}

}
