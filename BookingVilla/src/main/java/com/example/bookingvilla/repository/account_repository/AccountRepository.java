package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.repository.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountRepository implements IAccountRepository{
    private static final String SELECT_ACCOUNT = "SELECT * FROM booking.account_customers\n" +
            "WHERE user_name = ? AND password_account = ?";
    private static final String SELECT_ACCOUNT_BY_USER_NAME = "SELECT * FROM booking.account_customers\n" +
            "WHERE user_name = ?" ;

    private static final String INSERT_ACCOUNT = "INSERT INTO account_customers(user_name,password_account)\n" +
            "VALUES (?,?)";

    @Override
    public Account getAccountByUserNameAndPassword (String userName, String password) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Account(resultSet.getInt(1),
                                    resultSet.getString(2),
                                    resultSet.getString(3),
                                    resultSet.getBoolean(4));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Account getAccountByUserName(String userName) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ACCOUNT_BY_USER_NAME);
            preparedStatement.setString(1,userName);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                return new Account(resultSet.getInt(1),
                                    resultSet.getString(2),
                                        resultSet.getString(3),
                                            resultSet.getBoolean(4));
            }
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void save(Account account) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ACCOUNT);
            preparedStatement.setString(1,account.getUserName());
            preparedStatement.setString(2,account.getPassword());
            preparedStatement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
