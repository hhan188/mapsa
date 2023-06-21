package practices.practice22.answers.exercise05;


import practices.practice22.entity.Person;
import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static practices.practice22.utils.StringBuild.listConvertor;

public class Main {

    //Retrieve the persons whose age is between 30 and 40.
    public static void main(String[] args) throws SQLException {
        String query="select * from person where age <= 40 and age >= 30 order by age";
        Connection connection= JDBCConnection.getConnection();
        PreparedStatement ps= null;
        if (connection != null) {
            ps = connection.prepareStatement(query);
        }
        ResultSet result= null;
        if (ps != null) {
            result = ps.executeQuery();
        }
        List<Person> list=new ArrayList<>();
        while (ps!=null && result.next()){
            list.add(new Person(
                    result.getInt("ID")
                    , result.getString("NAME")
                    , result.getString("EMAIL")
                    , result.getString("PHONE_NUMBER")
                    , result.getInt("AGE")
                    , result.getString("GENDER")
                    , result.getDate("date_of_birth")
                    , result.getString("occupation")
                    , result.getString("education_level")
                    , result.getString("marital_status")
                    , result.getDouble("income")));
        }
        System.out.println(listConvertor(list));
    }
}
