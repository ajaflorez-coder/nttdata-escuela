package com.company;

// Modificadores: private, public and protected
public abstract class Account {
    private int id;
    private String accountNumber;
    private Double amount;

    public Account() {
    }

    public Account(int id, String accountNumber, Double amount) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
