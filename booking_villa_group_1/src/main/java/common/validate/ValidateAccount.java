package common.validate;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.repository.account_repository.AccountRepository;
import com.example.bookingvilla.repository.account_repository.IAccountRepository;

public class ValidateAccount {
    private static IAccountRepository iAccountRepository = new AccountRepository();

    public static boolean validateUserName(String userName) {
        Account account = iAccountRepository.getAccountByUserName(userName);
        if (account == null) {
            return true;
        }
        return false;
    }
}
