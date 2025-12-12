package com.coderjd.repository;

import com.coderjd.connection.ConnectionService;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }
}
