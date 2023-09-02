package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;

public class Test {
    public static void main(String[] args) {
        Account account =new Account("0842007468","okBan123456");
        int accountCode = account.getAccountCode();
        System.out.println(accountCode);
    }
}
