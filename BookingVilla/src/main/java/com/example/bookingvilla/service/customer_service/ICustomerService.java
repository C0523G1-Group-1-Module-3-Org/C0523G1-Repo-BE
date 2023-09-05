package com.example.bookingvilla.service.customer_service;

import com.example.bookingvilla.model.Customer;

public interface ICustomerService {
    void saveCustomer (Customer customer);
    Customer getCustomerByPhoneNumber (String phoneNumber);
    Customer getCustomerByIdentityNumber(String identityNumber);
    Customer getCustomerByEmail (String email);
    Customer getCustomerByCustomerCode(int customerCode);
    void  updateCustomer(String name, String identityNumber, String birthday, boolean gender,
                         String phoneNumber,String email,String address,int customerCode);

}
