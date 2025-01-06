package service;

import dao.AccountDAO;
import model.Account;

public class AccountService {

    private final AccountDAO accountDAO;

    public AccountService() {
        this.accountDAO = new AccountDAO();
    }

    public void deposit(double amount) {
        if(amount > 0){
            accountDAO.deposit(amount);
        }
    }

    public void withdraw(double amount){
        double balance = accountDAO.getAccount().getBalance();
        if (amount > balance) {
            throw new IllegalArgumentException("No funds");
        }
        accountDAO.withdraw(amount);
    }

    public double getBalance(){
        return accountDAO.getAccount().getBalance();
    }

    public void printStatement() {
        accountDAO.getAccount().getOperations().forEach(System.out::println);
    }

}
