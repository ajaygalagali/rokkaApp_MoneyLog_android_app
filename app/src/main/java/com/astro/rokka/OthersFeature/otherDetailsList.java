package com.astro.rokka.OthersFeature;

public class otherDetailsList {
    private int amount;
    private int balance;
    private String note;
    private String date;
    private int id;

    public otherDetailsList(int amount, int balance, String note, String date,int id) {
        this.amount = amount;
        this.balance = balance;
        this.note = note;
        this.date = date;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
