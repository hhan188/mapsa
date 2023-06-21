package practices.practice22.answers.exercise15;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    //15 - Retrieve the persons whose names contain the word "Smith" and are older than 40.
    public static void main(String[] args) throws SQLException {
        String query = "SELECT * from person where person.name like '%Smith%' and age >40 ";
        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+" age: "+rs.getInt("AGE"));
        }

    }
}

