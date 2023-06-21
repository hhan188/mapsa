package practices.practice22.answers.exercise17;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    //17 - Retrieve the persons and their ages, giving the age column an alias of "Years".
    public static void main(String[] args) throws SQLException {
        String query = "SELECT id,name,gender ,age as YEARS from person order by id";
        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " age: " + rs.getInt("YEARS")
                    + " gender: " + rs.getString(3));
        }

    }
}

