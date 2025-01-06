package service;

import dao.AccountDAO;

public class AccountService {

    private final AccountDAO accountDAO;

    public AccountService() {
        this.accountDAO = AccountDAO.getInstance();
    }

}
