package com.scytalys.codelearn.exersices;

public class InvalidAnswerException extends Exception{
    public InvalidAnswerException() {
        super("This is not a valid answer");
    }
}
