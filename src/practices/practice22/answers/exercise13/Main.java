package practices.practice22.answers.exercise13;


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
    public static void main(String[] args) throws SQLException {
        //Retrieve the persons whose email addresses contain "gmail.com".
        String query="select * from person where email like '%gmail.com' ";

        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection != null ? connection.prepareStatement(query) : null;
        List<Person> list = new ArrayList<>();
        ResultSet result = ps != null ? ps.executeQuery() : null;
        while (result != null && result.next()) {
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
        if (ps != null) {
            ps.close();
            System.out.println(listConvertor(list));
        }
    }
}
