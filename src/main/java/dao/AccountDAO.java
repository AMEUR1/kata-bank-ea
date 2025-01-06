package dao;

import model.Account;
import model.Operation;

import java.util.List;

public class AccountDAO {

    private Account account;

    public AccountDAO() {
        this.account = new Account();
    }


    public Account getAccount() {
        return account;
    }

    public void deposit(double amount) {
        double balance = account.getBalance() + amount;
        account.setBalance(balance);
        List<Operation> operations = account.getOperations();
        operations.add(new Operation("Deposit", amount, balance));
    }

    public void withdraw(double amount) {
        double balance = account.getBalance();
        balance -= amount;
        account.setBalance(balance);
        List<Operation> operations = account.getOperations();
        operations.add(new Operation("Withdrawal", amount, balance));
    }

}
