package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;

public interface IAccountRepository {
    Account getAccountByUserNameAndPassword (String userName, String password);
    Account getAccountByUserName(String userName);
    Customer getCustomerByIdentityNumber(String identityNumber);
    void save(Account account);

}
