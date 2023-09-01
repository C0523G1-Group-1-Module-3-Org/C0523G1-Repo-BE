package com.example.bookingvilla.common.validate;

import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.customer_repository.CustomerRepository;
import com.example.bookingvilla.repository.customer_repository.ICustomerRepository;

public class ValidateCustomer {
    private static final String REGEX_IDENTITY_NUMBER = "^[0-9]{10,12}$";
    private static  ICustomerRepository iCustomerRepository = new CustomerRepository();

    public static boolean validateIdentityNumber(String identityNumber) {
        if (identityNumber.matches(REGEX_IDENTITY_NUMBER)) {
            Customer customer = iCustomerRepository.getCustomerByIdentityNumber(identityNumber);
            if (customer == null) {
                return true;
            }
        }
        return false;
    }

}
