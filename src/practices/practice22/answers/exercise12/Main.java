package practices.practice22.answers.exercise12;


import com.mysql.cj.jdbc.JdbcConnection;
import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    //Retrieve the persons who have a salary greater than the average income.


    public static void main(String[] args) throws SQLException {
        double sumOfIncome = 0;
        Connection connection= JDBCConnection.getConnection();
        PreparedStatement ps= connection.prepareStatement("select sum(income) as incoms from person");
        ResultSet  rs= ps.executeQuery();
        while (rs.next()){
            sumOfIncome=rs.getDouble("incoms");

        }
        ps.close();
        rs.close();
        System.out.println("Sum of incomes Of People Is: "+sumOfIncome);
    }
}
