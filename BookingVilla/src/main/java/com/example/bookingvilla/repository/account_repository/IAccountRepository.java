package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;

public interface IAccountRepository {
    Account getAccountByUserNameAndPassword (String userName, String password);
    Account getAccountByUserName(String userName);
    void save(Account account);

}
