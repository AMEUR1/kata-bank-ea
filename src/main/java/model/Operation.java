package model;

import java.time.LocalDateTime;

public class Operation {

    private final LocalDateTime date;
    private final double amount;
    private final double balance;

    public Operation(LocalDateTime date, double amount, double balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
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
}
