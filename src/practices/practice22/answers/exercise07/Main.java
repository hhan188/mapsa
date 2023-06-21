package practices.practice22.answers.exercise07;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection= JDBCConnection.getConnection();
        PreparedStatement ps= null;
        if (connection != null) {
            ps = connection.prepareStatement("DELETE FROM person WHERE age<18");
        }
        int deleteRows= 0;
        if (ps != null) {
            deleteRows = ps.executeUpdate();
            ps.close();
        }
        System.out.println(deleteRows+" Rows Is Deleted");
    }
}
