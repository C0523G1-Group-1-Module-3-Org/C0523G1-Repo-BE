package com.example.bookingvilla.repository.customer_repository;

import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerRepository implements ICustomerRepository{
    private static final String SELECT_ACCOUNT_BY_IDENTITY_NUMBER = "SELECT * FROM customers\n" +
            "WHERE identity_number = ?";
    private static final String SELECT_ACCOUNT_BY_EMAIL = "SELECT * FROM customers\n" +
            "WHERE email = ?";
    private static final String INSERT_CUSTOMER = "INSERT INTO customers (name, identity_number, birthday, gender, phone_number, email, address, account_code) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    @Override
    public Customer getCustomerByIdentityNumber(String identityNumber) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_BY_IDENTITY_NUMBER);
            preparedStatement.setString(1,identityNumber);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Customer(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getBoolean(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_BY_EMAIL);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Customer(resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getBoolean(5),
                        resultSet.getString(6),
                        resultSet.getString(7),
                        resultSet.getString(8),
                        resultSet.getInt(9),
                        resultSet.getBoolean(10));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void saveCustomer(Customer customer) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER);
            preparedStatement.setString(1,customer.getCustomerName());
            preparedStatement.setString(2,customer.getIdentityNumber());
            preparedStatement.setString(3,customer.getDateOfBirth());
            preparedStatement.setBoolean(4,customer.isGender());
            preparedStatement.setString(5,customer.getPhoneNumber());
            preparedStatement.setString(6,customer.getEmail());
            preparedStatement.setString(7,customer.getAddress());
            preparedStatement.setInt(8,customer.getAccountCode());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
