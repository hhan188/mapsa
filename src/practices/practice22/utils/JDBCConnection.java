package practices.practice22.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

    private static final String HOST_NAME = "jdbc:mysql://localhost:3306/mapsa";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "1234";


    private JDBCConnection() {

    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(HOST_NAME, USER_NAME, PASSWORD);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
