package com.java8.AnonymousClass;

public class Launch {

    public static void main(String[] args) {
//        new BankImp().transaction();
        //anonymous inner class
        Bank bank = new Bank() {
            @Override
            public void transaction() {
                System.out.println("Bank Transaction");
            }
        };
        bank.transaction();

    }
}
