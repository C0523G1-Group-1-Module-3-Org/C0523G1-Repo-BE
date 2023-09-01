package com.example.bookingvilla.model;

public class Customer {
    private int customerCode;
    private String customerName;
    private String identityNumber;
    private String dateOfBirth;
    private boolean isGender;
    private String phoneNumber;
    private String address;
    private String email;
    private String accountCode;
    private boolean isDelete;

    public Customer() {
    }

    public Customer(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Customer(String customerName, String identityNumber, String dateOfBirth, boolean isGender,
                    String phoneNumber, String address, String email, String accountCode, boolean isDelete) {
        this.customerName = customerName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
        this.isGender = isGender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.accountCode = accountCode;
        this.isDelete = isDelete;
    }

    public Customer(int customerCode, String customerName, String identityNumber, String dateOfBirth, boolean isGender,
                    String phoneNumber, String address, String email, String accountCode, boolean isDelete) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.identityNumber = identityNumber;
        this.dateOfBirth = dateOfBirth;
        this.isGender = isGender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.accountCode = accountCode;
        this.isDelete = isDelete;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isGender() {
        return isGender;
    }

    public void setGender(boolean gender) {
        isGender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode=" + customerCode +
                ", customerName='" + customerName + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", isGender=" + isGender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
