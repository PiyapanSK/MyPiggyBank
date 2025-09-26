package com.learning;

public class PiggyBank {
    String ownerName;
    double money;

    public PiggyBank(String ownerName) {
        this.ownerName = ownerName;
        this.money = 0.0;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            money += amount;
            System.out.println("หยอดเงินใส่กระปุกของ \"" + ownerName + "\" จำนวน " + amount + " บาท");
        } else {
            System.out.println("จำนวนเงินต้องมากกว่า 0 บาท");
        }
    }

    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= money) {
            money -= amount;
            System.out.println("ถอนเงินจากกระปุกของ \"" + ownerName + "\" จำนวน " + amount + " บาท");
        } else if (amount > money) {
            System.out.println("ยอดเงินไม่พอสำหรับการถอนจากกระปุกของ \"" + ownerName + "\"");
        } else {
            System.out.println("จำนวนเงินที่ถอนต้องมากกว่า 0 บาท");
        }
    }

    public void showMoney() {
        System.out.println("กระปุกของ \"" + ownerName + "\" มีเงินทั้งหมด " + money + " บาท");
    }
}

