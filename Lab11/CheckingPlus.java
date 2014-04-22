

public class CheckingPlus extends BankAccount
{
	private double limit;
	private double rate;
	private double owed = 0;

	public CheckingPlus(String ID, String PIN, double balance, double limit, double rate)
	{
		super(ID, PIN, balance);
		System.out.println("Back in the constructor for CheckingPlus");
		this.limit = limit;
		this.rate = rate;

	}

	public void deposit(double dAmount)
	{
	    System.out.println("In deposit() for CheckingPlus");
	    if(owed == 0)
	      setBalance(getBalance( ) + dAmount);
	    else
	    {
	        if (dAmount >= owed)
	        {
	            setBalance(dAmount - owed);
	            owed = 0;
	        }
	        else
	        {
	            owed -= dAmount;
	        }
	     }
	   }

	  public void withdraw(double wAmount)
	  {
	      if(getBalance() >= wAmount)
	         setBalance(getBalance() - wAmount);
	      else
	      {
	          if(getBalance() + (limit - owed) >= wAmount)
	          {
	            owed = owed + wAmount;
	           }
	         else
	         {
	             System.out.println("You are trying to withdraw beyond your limit. Transaction cancelled.\nBalance: " + getBalance( ) + "\n Amount Owed: "  +   owed);
	         }
	       }
	   }

}
