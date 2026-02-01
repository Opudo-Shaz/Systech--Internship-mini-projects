package com.example.assessments.assessment3_sharon_opudo.problem2;

//inavlid-transction exception is unchecked so it extends RuntimeException
public class InvalidTransactionException extends  RuntimeException{
        public InvalidTransactionException(String message) {
        super(message);
    }
    
    
} 
 