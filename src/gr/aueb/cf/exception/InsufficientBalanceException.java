package gr.aueb.cf.exception;

public class InsufficientBalanceException extends Exception {

    private static final long serialVersionUID = 1L;
    public InsufficientBalanceException (double balance, double amount) {
        super("Insufficient Balance " + balance + "for amount" + amount) ;
    }
}