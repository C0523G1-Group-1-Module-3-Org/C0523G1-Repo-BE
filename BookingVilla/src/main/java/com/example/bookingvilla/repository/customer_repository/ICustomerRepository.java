package com.example.bookingvilla.repository.customer_repository;

import com.example.bookingvilla.model.Customer;

public interface ICustomerRepository {
    Customer getCustomerByIdentityNumber(String identityNumber);
    Customer getCustomerByEmail (String email);
    void saveCustomer (Customer customer);
}
