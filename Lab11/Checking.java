

public class Checking extends BankAccount
{
	public Checking(String ID, String PIN, double balance)
	{
	    super(ID, PIN, balance);
	    System.out.println("Execution back in Checking");
	}

	public void withdraw(double wAmount)
	{
        System.out.println("Got here");
	    if(getBalance() + .25 < wAmount)
	      System.out.println("Checking account withdrawal, unable to complete transaction. Balance: " + getBalance());
	    else
	     // setBalance(getBalance( ) - (wAmount + .25)) ;
          balance = balance - wAmount - .25;
     }

}
