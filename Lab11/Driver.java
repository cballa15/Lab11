/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Write a description of class Driver here.
 * 
 * @author Chris
 * @version (a version number or a date)
 */
import java.util.*;

public class Driver {

    /**
     * Constructor for objects of class Driver
     */
    public Driver() {
    }

    /**
     * main method, application starts here.
     * 
     * @param args execution arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name;
        String pin;
        double deposit = 0;
        double withdraw = 0;
        boolean keepGoing = true;

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new Savings("Joe", "1234", 1000);
        accounts[1] = new Savings("Blow", "12345", 1000);
        accounts[2] = new CheckingPlus("Snuffy", "123", 2000, 5000, .02);
        accounts[3] = new Checking("Bill", "123", 2500);
        accounts[4] = new Checking("Jill", "123", 2500);

        System.out.print("Enter an account name: ");
        name = input.next();
        System.out.print("Enter PIN: ");
        pin = input.next();

        boolean found = false;
        int i = 0;
        int userNum = 0;
        while (keepGoing) {
            try {
                while (i < accounts.length && !found) {
                    if (accounts[i].verify(name, pin)) {
                        found = true;
                        userNum = i;
                    } // end if
                    else {
                        i++;
                    } // end else
                } // end while
                if (!found) {
                    throw new InvalidUser("Error trying to access account " + name + " " + pin);
                } // end if
                System.out.println("What transaction would you like to complete?  ");
            } // end try
            catch (InvalidUser iu) {
                System.out.println(iu.getMessage());
            } // end catch

            if(found) {

            System.out.print("Enter an amount to deposit: ");
            accounts[userNum].deposit(input.nextDouble());
            System.out.println("Current Balance: $" + accounts[userNum].getBalance());

            System.out.print("Enter an amount to withdraw: ");
            accounts[userNum].withdraw(input.nextDouble());
            System.out.println("Current Balance: $" + accounts[userNum].getBalance());

            System.out.println("Pick another account? (y/n)");
            if(input.next().charAt(0) == 'n'){
                keepGoing = false;
            }
            }
        } // end while



    }
}
