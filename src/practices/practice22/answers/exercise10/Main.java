package practices.practice22.answers.exercise10;


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

    //10 - Retrieve the persons who have more than 2 posts.
    public static void main(String[] args) throws SQLException {
        String query="SELECT * FROM person WHERE id IN (SELECT person_id FROM post GROUP BY person_id HAVING COUNT(id) > 2)";

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
        while (ps!=null&&result.next()){
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
        }

        System.out.println(listConvertor(list));

    }
}
