package com.pluralsight;

import finance.BankAccount;

public class FinanceApplication {
    static void main() {

        BankAccount account1 = new BankAccount("123", "Pam", 12500);
        IValuable account2 = new BankAccount("456", "Gary", 1500);
// try to deposit money into both accounts
        account1.deposit(100);
//        account2.deposit(100);
    }
}
