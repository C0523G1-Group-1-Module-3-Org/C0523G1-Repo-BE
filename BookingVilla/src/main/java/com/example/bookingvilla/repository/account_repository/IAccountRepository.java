package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;

public interface IAccountRepository {
    Account getAccountByUserNameAndPassword (String userName, String password);
    Account getAccountByUserName(String userName);
    void save(Account account);
    void updatePassword (String password,String userName);
    void getPassword (String identityNumber, String phoneNumber, String newPassword);
    void updateUserName (String userName,int accountCode);
    void deleteAccountAndCustomer (int accountCode);

}
