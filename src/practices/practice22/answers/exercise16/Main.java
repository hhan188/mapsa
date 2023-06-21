package practices.practice22.answers.exercise16;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    //16 - Retrieve the persons whose names have at least 5 characters and end with the letter 'a'.
    public static void main(String[] args) throws SQLException {
        String query = "SELECT * from person where length(person.name )>=5 and  person.name like '%a'";
        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+" age: "+rs.getInt("AGE"));
        }

    }
}

