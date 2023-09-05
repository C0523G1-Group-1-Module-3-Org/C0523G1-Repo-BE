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

    @Override
    public void updatePassword(String password,String userName) {
        iAccountRepository.updatePassword(password,userName);
    }

    @Override
    public void getPassword(String identityNumber, String phoneNumber, String newPassword) {
        iAccountRepository.getPassword(identityNumber,phoneNumber,newPassword);
    }

    @Override
    public void updateUserName(String userName, int accountCode) {
        iAccountRepository.updateUserName(userName,accountCode);
    }

    @Override
    public void deleteAccountAndCustomer(int accountCode) {
        iAccountRepository.deleteAccountAndCustomer(accountCode);
    }
}
