package com.example.bookingvilla.common.validate;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.account_repository.AccountRepository;
import com.example.bookingvilla.repository.account_repository.IAccountRepository;

public class ValidateAccount {
    private static final String REGEX_PHONE_NUMBER = "^(84|0[3|5|7|8|9])+([0-9]{7,8})$";
    private static final String REGEX_PASSWORD = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$";
    private static IAccountRepository iAccountRepository = new AccountRepository();

    public static boolean validatePhoneNumberToSignUp(String userName) {
        if (userName.matches(REGEX_PHONE_NUMBER)) {
            Account account = iAccountRepository.getAccountByUserName(userName);
            if (account == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean validatePassword(String password) {
        if (password.matches(REGEX_PASSWORD)) {
            return true;
        }
        return false;
    }

}
