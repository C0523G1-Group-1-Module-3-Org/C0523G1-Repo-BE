package com.example.bookingvilla.repository.customer_repository;

import com.example.bookingvilla.model.Customer;

public interface ICustomerRepository {
    Customer getCustomerByIdentityNumber(String identityNumber);
}
