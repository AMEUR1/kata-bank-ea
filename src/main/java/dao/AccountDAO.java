package dao;

import model.Account;

public class AccountDAO {

    private static AccountDAO instance;

    private Account account;

    public AccountDAO() {
        this.account = new Account();
    }

    public static AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    public Account getAccount() {
        return account;
    }
}
