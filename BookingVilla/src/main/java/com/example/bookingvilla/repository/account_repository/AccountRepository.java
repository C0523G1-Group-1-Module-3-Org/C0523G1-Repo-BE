package com.example.bookingvilla.repository.account_repository;

import com.example.bookingvilla.model.Account;
import com.example.bookingvilla.model.Customer;
import com.example.bookingvilla.repository.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.Callable;

public class AccountRepository implements IAccountRepository{
    private static final String SELECT_ACCOUNT = "SELECT * FROM villa_booking.accounts\n" +
            "WHERE user_name = ? AND password_account = ? AND is_delete <> 1";
    private static final String SELECT_ACCOUNT_BY_USER_NAME = "SELECT * FROM villa_booking.accounts\n" +
            "WHERE user_name = ?" ;

    private static final String INSERT_ACCOUNT = "INSERT INTO accounts(user_name,password_account)\n" +
            "VALUES (?,?)";
    private static final String  UPDATE_PASSWORD =
            "UPDATE accounts\n" +
            "SET password_account = ?\n" +
            "WHERE user_name = ?;\n" ;
    private static final String  UPDATE_USER_NAME =
            "UPDATE accounts\n" +
                    "SET user_name = ?\n" +
                    "WHERE account_code = ?;\n" ;
    private static final String GET_PASSWORD = "call  resetPasswordByCMNDAndUsername(?,?,?);\n";
    private static final String DELETE_ACCOUNT_AND_CUSTOMER = "call deleteAccountAndCustomer(?)";


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

    @Override
        public void updatePassword(String password,String userName) {
            Connection connection = DatabaseConnection.getConnection();
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PASSWORD);
                preparedStatement.setString(1,password);
                preparedStatement.setString(2,userName);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    @Override
    public void getPassword(String identityNumber, String phoneNumber, String newPassword) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(GET_PASSWORD);
            preparedStatement.setString(1,identityNumber);
            preparedStatement.setString(2,phoneNumber);
            preparedStatement.setString(3,newPassword);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUserName(String userName,int accountCode) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER_NAME);
            preparedStatement.setString(1,userName);
            preparedStatement.setInt(2,accountCode);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteAccountAndCustomer(int accountCode) {
        Connection connection = DatabaseConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ACCOUNT_AND_CUSTOMER);
            preparedStatement.setInt(1,accountCode);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
