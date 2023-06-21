package practices.practice22.answers.exercise14;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    //14 - Retrieve the persons grouped by nationality and display the count of persons in each group
    public static void main(String[] args) throws SQLException {
        String query = "SELECT gender, count(*) FROM person GROUP BY gender";

        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getInt(2));
        }

    }
}

