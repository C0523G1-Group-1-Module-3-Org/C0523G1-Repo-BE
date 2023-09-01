package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.common.validate.ValidateAccount;
import com.example.bookingvilla.model.Account;

public class Test {
    public static void main(String[] args) {
       String pass = "123adDsadasd";
       if (ValidateAccount.validatePassword(pass)){
           System.out.println("ok");
       }
       else {
           System.out.println("no");
       }
    }
}
