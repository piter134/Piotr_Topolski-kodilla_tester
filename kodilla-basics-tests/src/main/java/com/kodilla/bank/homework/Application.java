package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        CashMachine cashMachine3 = new CashMachine();
        System.out.println(cashMachine.getBalance());
        System.out.println(cashMachine.getTransactionsCount());

        CashMachine[] cashMachines  = {cashMachine,cashMachine2,cashMachine3};
        Bank bank = new Bank(cashMachines);
        System.out.println(bank.getCashMachinesBalance());
        System.out.println(bank.getCashMachinesWithDrawNumber());
        System.out.println(bank.getCashMachinesDepositNumber());
        System.out.println(bank.getCashMachinesWithDrawAverage());
        System.out.println(bank.getCashMachinesDepositAverage());
    }
}
