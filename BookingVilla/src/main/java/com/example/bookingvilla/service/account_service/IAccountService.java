package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.model.Account;

public interface IAccountService {
    Account login (String userName, String password);

}
