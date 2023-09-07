package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;

public interface IAccountRepository {
    Account getAccountByPhoneNumberAndPassword (String phoneNumber, String password);
    Account getAccountByUserName(String userName);
    void save(Account account);
    void updatePassword (String password,String userName);
    void getPassword (String password, String identityNumber, String phoneNumber);
    void updateUserName (String userName,int accountCode);
    void deleteAccountAndCustomer (int accountCode);
    Account getAccountByAccountCode(int accountCode);

}
