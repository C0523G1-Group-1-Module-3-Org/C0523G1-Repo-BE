package com.example.bookingvilla.repository.customer_repository;

import com.example.bookingvilla.model.Customer;

public interface ICustomerRepository {
    Customer getCustomerByIdentityNumber(String identityNumber);
    Customer getCustomerByEmail (String email);
    void saveCustomer (Customer customer);
    Customer getCustomerByPhoneNumber (String phoneNumber);
    Customer getCustomerByCustomerCode(int customerCode);
    void  updateCustomer(String name, String identityNumber, String birthday, boolean gender,
                         String phoneNumber,String email,String address,int customerCode);
}
