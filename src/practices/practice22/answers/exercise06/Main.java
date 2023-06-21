package practices.practice22.answers.exercise06;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String query = "update mapsa.person set age=35 where email='johnsmith@gmail.com'";
        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = null;
        if (connection != null) {
            ps = connection.prepareStatement(query);
        }
        int updateCounter = 0;
        if (ps != null) {
            updateCounter = ps.executeUpdate();
        }
        if (ps != null) {
            ps.close();
        }
        System.out.println(updateCounter + " Rows Is Updated");
    }
}
