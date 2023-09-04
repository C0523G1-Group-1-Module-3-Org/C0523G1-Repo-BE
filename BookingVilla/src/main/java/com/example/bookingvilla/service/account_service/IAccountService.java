package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.model.Account;

public interface IAccountService {
    boolean login (String userName, String password);
    void save(Account account);
    Account getAccountByUserName(String userName);
    void updatePassword (String password,String userName);
    void getPassword (String identityNumber, String phoneNumber, String newPassword);


}
