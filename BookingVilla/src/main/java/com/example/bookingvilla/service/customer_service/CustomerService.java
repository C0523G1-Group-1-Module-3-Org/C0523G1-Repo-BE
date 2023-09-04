package com.example.bookingvilla.service.customer_service;

import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.customer_repository.CustomerRepository;
import com.example.bookingvilla.repository.customer_repository.ICustomerRepository;

public class CustomerService implements ICustomerService{
    private ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void saveCustomer(Customer customer) {
        iCustomerRepository.saveCustomer(customer);
    }

    @Override
    public Customer getCustomerByPhoneNumber(String phoneNumber) {
        return iCustomerRepository.getCustomerByPhoneNumber(phoneNumber);
    }

    @Override
    public Customer getCustomerByIdentityNumber(String identityNumber) {
        return iCustomerRepository.getCustomerByIdentityNumber(identityNumber);
    }
}
