package main;

import service.AccountService;

public class Main {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();

        System.out.println("Depositing 200...");
        accountService.deposit(200.0);

        System.out.println("Current balance: " + accountService.getBalance());

        System.out.println("Withdrawing 50...");
        accountService.withdraw(50.0);

        System.out.println("Current balance: " + accountService.getBalance());

        try {
            System.out.println("Attempting to withdraw 300...");
            accountService.withdraw(300.0); // Should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Account statement:");
        accountService.printStatement();
    }

}
