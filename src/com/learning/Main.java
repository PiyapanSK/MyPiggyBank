package com.learning;

public class Main {
    public static void main(String[] args) {
        PiggyBank bank = new PiggyBank("น้องพอใจ");
        bank.showMoney();
        bank.addMoney(20);
        bank.addMoney(50);
        bank.addMoney(5.5);
        bank.showMoney();
        bank.withdrawMoney(30);
        bank.withdrawMoney(100);
        bank.withdrawMoney(-10);
        bank.showMoney();
    }
}
