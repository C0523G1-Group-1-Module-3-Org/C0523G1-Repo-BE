package com.example.bookingvilla.model;

public class Account {
    private int accountCode;
    private String userName;
    private String password;
    private boolean isDelete = false;

    public Account(String userName) {
        this.userName = userName;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Account(int accountCode, String userName, String password, boolean isDelete) {
        this.accountCode = accountCode;
        this.userName = userName;
        this.password = password;
        this.isDelete = isDelete;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(int accountCode) {
        this.accountCode = accountCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountCode=" + accountCode +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
