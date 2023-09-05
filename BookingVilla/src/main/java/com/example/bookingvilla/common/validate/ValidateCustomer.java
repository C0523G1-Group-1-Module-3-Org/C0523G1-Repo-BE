package com.example.bookingvilla.common.validate;

import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.customer_repository.CustomerRepository;
import com.example.bookingvilla.repository.customer_repository.ICustomerRepository;

public class ValidateCustomer {
    private static ICustomerRepository iCustomerRepository = new CustomerRepository();

    public static boolean validateIdentityNumber(String identityNumber) {
            Customer customer = iCustomerRepository.getCustomerByIdentityNumber(identityNumber);
            if (customer == null) {
                return true;
            }
        return false;
    }

    public static boolean validateEmail(String email) {
        Customer customer = iCustomerRepository.getCustomerByEmail(email);
        if (customer == null) {
            return true;
        }
        return false;
    }

}
