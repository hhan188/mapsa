package practices.practice22.answers.exercise03;

import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupByAgeCount {

    protected static String groupByAge(){
        StringBuilder builder=new StringBuilder();

        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps ;
        try {
            ps = connection != null ? connection.prepareStatement("select count(age),age from person group by age order by age") : null;
        ResultSet result = ps != null ? ps.executeQuery() : null;
        while (ps!=null&& result.next()){
            builder.append("Count: ")
                    .append(result.getInt("count(age)"))
                    .append(" Age is: ")
                    .append(result.getInt("age"))
                    .append("\n");
        }
            if (ps != null) {
                ps.close();
            }
            return builder.toString();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }



}
