package com.example.assessments.javase010.Assignment2Assessment2;

import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public String addAccount(BankAccount account) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                return "Account number already exists.";
            }
        }
        accounts.add(account);
        return "Account added successfully.";
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }
    }

    public void applyInterestToSavingsAccounts() {
        for (BankAccount acc : accounts) {
            if (acc instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) acc;
        }
    }


    
}
    public String transfer(String fromAcc, String toAcc, double amount) {
        BankAccount from = findAccount(fromAcc);
        BankAccount to = findAccount(toAcc);

        if (from == null || to == null) {
            return "One or both accounts not found.";
        }

        String withdrawMsg = from.withdraw(amount);
        if (!withdrawMsg.startsWith("Withdrawal successful") &&
            !withdrawMsg.startsWith("Withdrew")) {
            return "Transfer failed: " + withdrawMsg;
        }

        to.deposit(amount);
        return "Transfer successful from " + fromAcc + " to " + toAcc;
    }

}

 