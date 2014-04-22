

public class Savings extends BankAccount
{
  public Savings(String ID, String PIN, double balance)
  {
      super(ID,  PIN,  balance);
  }
   public void withdraw(double wAmount)
  {
      if(getBalance( ) < wAmount)
        System.out.println("Cannot complete transaction: balance = "  + getBalance());
      else
         setBalance(getBalance() - wAmount);
  }

  public String toString( )
  {
      return ID + " " + PIN + " "
      + super.toString( );
    }


}
