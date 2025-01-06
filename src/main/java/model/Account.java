package model;

import java.util.ArrayList;
import java.util.List;

public class Account {

    private double balance;
    private final List<Operation> operations;

    public Account() {
        this.balance = 0.0;
        this.operations = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }
}
