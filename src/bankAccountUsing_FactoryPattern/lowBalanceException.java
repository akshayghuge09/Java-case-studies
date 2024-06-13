package bankAccountUsing_FactoryPattern;

public class lowBalanceException extends Exception {
	 
	public lowBalanceException() 
	{
		
	}
	public lowBalanceException(String msg)
	{
		super(msg);
	}

}
