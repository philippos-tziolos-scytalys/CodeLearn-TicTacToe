package com.scytalys.codelearn.exersices;

public class NotAvailableMoveException extends Exception {
    public NotAvailableMoveException() {
        super("This is not an available move.");
    }
}