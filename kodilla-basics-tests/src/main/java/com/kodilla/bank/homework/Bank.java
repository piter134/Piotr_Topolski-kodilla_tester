package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getCashMachinesBalance() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getBalance();
        }
        return sum;
    }

    public int getCashMachinesWithDrawNumber() {
        int withDrawNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            withDrawNumber = withDrawNumber + cashMachines[i].getWithDrawsCount();
        }
        return withDrawNumber;
    }
    public int getCashMachinesDepositNumber() {
        int depositNumber = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            depositNumber = depositNumber + cashMachines[i].getDepositCount();
        }
        return depositNumber;
    }
    public int getCashMachinesWithDrawAverage() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getWithDrawAverage();
        }
        int average = sum / cashMachines.length;
        return average;
    }
    public int getCashMachinesDepositAverage() {
        int sum = 0;
        for (int i = 0; i < cashMachines.length; i++) {
            sum = sum + cashMachines[i].getDepositAverage();
        }
        int average = sum / cashMachines.length;
        return average;
    }
}


