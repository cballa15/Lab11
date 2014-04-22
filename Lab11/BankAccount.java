

public abstract class BankAccount
{
    protected String ID;
	protected String PIN;
	protected double balance;

	public BankAccount( )
	{
	    ID = "none";
	    PIN = "none";
	    balance = 0;
	    System.out.println("In super no-args constructor");
	}

	public BankAccount(String id, String pin, double bal)
	{
	    ID = id;
	    PIN = pin;
	    balance = bal;
	    System.out.println("In super constructor with args");
	}

	public double getBalance( )
	{
	    return balance;
	}


	protected void setBalance(double pBalance)
	{
	    balance = pBalance;
	}


	public void deposit(double amount)
	{
	    System.out.println("In deposit( ) for super");
	    balance = amount > 0? balance + amount: balance;
	}


	public abstract void withdraw(double amount);


	public boolean verify(String pID, String pPIN)
	{
	    return (ID.equals(pID) && PIN.equals(pPIN));
    }

}

//  class InvalidAccount extends Exception
//  {
//      InvalidAccount(String msg)
//      {
//        super(msg);
//      }
//  }

//  class InsufficientFundsError extends Exception
//  {
//      InsufficientFundsError(String msg)
//      {
//        super(msg);
//      }
//  }