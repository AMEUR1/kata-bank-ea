package service;

import dao.AccountDAO;

public class AccountService {

    private final AccountDAO accountDAO;

    public AccountService() {
        this.accountDAO = new AccountDAO();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive and greater than zero.");
        }else {
            accountDAO.deposit(amount);
        }
    }

    public void withdraw(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive and greater than zero.");
        }else {
            double balance = accountDAO.getAccount().getBalance();
            if (amount > balance) {
                throw new IllegalArgumentException("Insufficient funds");
            }
            accountDAO.withdraw(amount);
        }
    }

    public double getBalance(){
        return accountDAO.getAccount().getBalance();
    }

    public void printStatement() {
        accountDAO.getAccount().getOperations().forEach(System.out::println);
    }

}
