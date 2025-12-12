package com.coderjd.repository;

import com.coderjd.connection.ConnectionService;
import com.coderjd.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public boolean addCustomer(Customer customer) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO customer VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, customer.getCustomerId());
            preparedStatement.setString(2, customer.getCustomerFName());
            preparedStatement.setString(3, customer.getCustomerLName());
            preparedStatement.setString(4, customer.getCustomerAddress());
            preparedStatement.setLong(5, customer.getCustomerMn());
            System.out.println("inserting student data to table: " + customer);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public Customer deleteCustomer() throws SQLException {
        this.initConnection();
        String query = "DELETE FROM customer WHERE customerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, deleteCustomer().getCustomerId());
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println("[REPOSITORY] Executed DELETE for ID: " + deleteCustomer().getCustomerId() + ". Rows affected: " + rowsDeleted);

        } catch (SQLException e) {
            System.err.println("[REPOSITORY ERROR] Failed to delete customer with ID " + deleteCustomer().getCustomerId());
            e.printStackTrace(); }
        return null;
    }

    public Customer displayCustomer() throws SQLException {
        this.initConnection();
        String query = "SELECT * FROM customer WHERE customerId = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, displayCustomer().getCustomerId());
        }
        return displayCustomer();
    }

}
