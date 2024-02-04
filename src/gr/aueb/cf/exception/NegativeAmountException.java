package gr.aueb.cf.exception;

import java.nio.file.Path;

public class NegativeAmountException extends Exception {
    private  static final long serialVersionUID = 1L;

    public NegativeAmountException (double amount) {
        super("Amount " + amount + "is negative") ;
    }
}
