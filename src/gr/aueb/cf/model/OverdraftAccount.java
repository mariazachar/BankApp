package gr.aueb.cf.model;

import gr.aueb.cf.exception.NegativeAmountException;
import gr.aueb.cf.exception.SsnNotValidException;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {}

    public OverdraftAccount(User holder, String iban, double balance) {
        super(holder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn)
            throws SsnNotValidException, NegativeAmountException {
        try {
            if (amount <0 ) throw new NegativeAmountException(amount);
            if (!isSsnValid(ssn)) throw  new SsnNotValidException(ssn);

            setBalance(getBalance() - amount);
        } catch ( SsnNotValidException | NegativeAmountException e)  {
            System.out.println("Error: withdrawal");
            throw  e;
        }
    }
}
