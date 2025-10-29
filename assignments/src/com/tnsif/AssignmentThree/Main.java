package com.tnsif.AssignmentThree;

public class Main {
    public static void main(String[] args) {
        Savingsaccount s1 = new Savingsaccount("Pavithra", 5000);
        Checkingaccount c1 = new Checkingaccount(null, 0);

        Transaction t = new Transaction();

        System.out.println("\n--- Savings Account ---");
        t.performTransaction(s1, 2000, "deposit");
        t.performTransaction(s1, 1000, "withdraw");

        System.out.println("\n--- Checking Account ---");
        t.performTransaction(c1, 500, "deposit");
        t.performTransaction(c1, 4000, "withdraw");

        System.out.println("\nTotal Bank Accounts: " + Bank.getTotalAccounts());
    }
}