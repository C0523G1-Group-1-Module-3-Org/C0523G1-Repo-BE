package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;

public interface IAccountRepository {
    Account login (String userName, String password);
}
