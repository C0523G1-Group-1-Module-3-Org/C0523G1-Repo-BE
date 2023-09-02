package com.example.bookingvilla.service.account_service;

import com.example.bookingvilla.common.validate.ValidateAccount;
import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.repository.account_repository.AccountRepository;
import com.example.bookingvilla.repository.account_repository.IAccountRepository;

public class AccountService implements IAccountService {
    private IAccountRepository iAccountRepository = new AccountRepository();
    @Override
    public boolean login(String userName, String password) {
        Account account = iAccountRepository.getAccountByUserNameAndPassword(userName,password);
        if (account != null){
            return true;
        }
        return false;
    }
    @Override
    public void save(Account account) {
        iAccountRepository.save(account);
    }

    @Override
    public Account getAccountByUserName(String userName) {
        return iAccountRepository.getAccountByUserName(userName);
    }
}
