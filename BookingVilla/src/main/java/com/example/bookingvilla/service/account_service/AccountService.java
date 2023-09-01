package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.repository.account_repository.AccountRepository;
import com.example.bookingvilla.repository.account_repository.IAccountRepository;

public class AccountService implements IAccountService {
    private IAccountRepository iAccountRepository = new AccountRepository();
    @Override
    public Account login(String userName, String password) {
        return iAccountRepository.login(userName,password);
    }

    @Override
    public void save(Account account) {
        iAccountRepository.save(account);
    }
}
