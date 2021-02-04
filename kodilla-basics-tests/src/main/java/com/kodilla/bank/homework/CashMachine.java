package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions = {2200, -150, -200, -350, -1400, 1500, 750};

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            sum = sum + transactions[i];
        }


        return sum;
    }
    public int getTransactionsCount() {
        return transactions.length;
    }
    public int getWithDrawsCount() {
        int withDrawNumber = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0){
                withDrawNumber = withDrawNumber + 1;
            }
        }
        return withDrawNumber;
    }

    public int getDepositCount() {
        int DepositNumber = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0){
                 DepositNumber = DepositNumber + 1;
            }
        }
        return DepositNumber;
    }

    public int getWithDrawAverage() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0){
                sum = sum + transactions[i];
            }
        }
        int average = sum / getWithDrawsCount();
        return average;
    }
    public int getDepositAverage() {
        int sum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0){
                sum = sum + transactions[i];
            }
        }
        int average = sum / getDepositCount();
        return average;
    }
}
