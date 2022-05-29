package capg.com.exception.assignment3;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Throwable
{
	

	public InsufficientBalanceException(String msg)
	{
		super(msg);
	}
	
}
@SuppressWarnings("serial")
class IllegalBankTransactionException extends Exception
{
	IllegalBankTransactionException(String m)
	{
		super(m);
	}
	
}