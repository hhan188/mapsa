package practices.practice22.answers.exercise04;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//4 - Retrieve the average age of persons.

public class Main {
    public static void main(String[] args) {

        double averageAge =0;

        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps ;
        try {
            assert connection != null;
            ps = connection.prepareStatement("select avg(age) from person");
            ResultSet set = ps.executeQuery();
           while (set.next()){
               averageAge =set.getDouble("avg(age)");
           }
            System.out.println("The Age Average Of The Person Table Is: "+averageAge);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
