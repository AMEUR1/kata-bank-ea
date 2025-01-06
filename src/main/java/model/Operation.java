package model;

import java.time.LocalDateTime;

public class Operation {

    private String type;
    private final LocalDateTime date;
    private final double amount;
    private final double balance;

    public Operation(String type, double amount, double balance) {
        this.type = type;
        this.date = LocalDateTime.now();
        this.amount = amount;
        this.balance = balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return date + " " + type + " " + amount + " Balance: " + balance;
    }
}
