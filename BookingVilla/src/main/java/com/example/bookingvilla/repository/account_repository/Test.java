package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;

public class Test {
    public static void main(String[] args) {
        IAccountRepository iAccountRepository = new AccountRepository();
        Account account = iAccountRepository.login("0704698161","12345");
        System.out.println(account);
    }
}
