package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.model.Account;

public interface IAccountService {
    boolean login (String phoneNumber, String password);
    void save(Account account);
    Account getAccountByUserName(String userName);
    void updatePassword (String password,String userName);
    void getPassword (String password, String identityNumber, String phoneNumber);
    void updateUserName (String userName,int accountCode);
    void deleteAccountAndCustomer (int accountCode);
    Account getAccountByAccountCode(int accountCode);

}
