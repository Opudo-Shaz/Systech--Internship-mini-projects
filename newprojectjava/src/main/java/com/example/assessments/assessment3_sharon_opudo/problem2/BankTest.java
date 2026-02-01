package com.example.assessments.assessment3_sharon_opudo.problem2; 

/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Sharon Opudo
 * Date: 1 February 2026
 * Problem: Problem 2 – Bank Transaction System with Robust Error Handling
 *
 * Key Features:
 * - Encapsulation of account details using the BankAccount class
 * - Method-based transaction handling (deposit, withdraw, transfer)
 * - Use of object interaction for fund transfers between accounts
 *
 * Exception Handling:
 * - Custom checked exception for insufficient funds during withdrawal
 * - Custom checked exception for invalid or non-existent accounts
 * - Runtime exception for invalid transaction values
 * - Use of multiple catch blocks and finally for safe execution
 *
 * Additional Implementations:
 * - Validation of transaction amounts
 * - Balance consistency during transfers
 */

public class BankTest {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("A101", "Alice", 500);
        BankAccount account2 = new BankAccount("B202", "Bob", 300);

        try {
            account1.deposit(-50);          // InvalidTransactionException(unchecked)
            account1.withdraw(1000);        // InsufficientFundException
            account1.transfer(null, 100);   // AccountNotFoundException
            account1.transfer(account2, 200);

            System.out.println("Transfer successful");
            System.out.println("Alice balance: " + account1.getBalance());
            System.out.println("Bob balance: " + account2.getBalance());

        } catch (InvalidTransactionException e) {
            System.out.println("Invalid transaction: " + e.getMessage());

        } catch (InsufficientFundException e) {
            System.out.println("Insufficient funds: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());

        } finally {
            System.out.println("Transaction processing completed.");
        }
        
        }
}
