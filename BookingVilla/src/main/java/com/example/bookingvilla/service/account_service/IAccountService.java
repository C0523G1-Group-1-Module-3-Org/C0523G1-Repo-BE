package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.model.Account;

public interface IAccountService {
    boolean login (String userName, String password);
    void save(Account account);
    boolean signUp (String password,String passwordConfirm);

}
