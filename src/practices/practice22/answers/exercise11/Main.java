package practices.practice22.answers.exercise11;


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

    //11 - Retrieve the persons and their total income, sorted in descending order of income.
    public static void main(String[] args) throws SQLException {
        Connection connection = JDBCConnection.getConnection();
        PreparedStatement ps = connection != null ? connection.prepareStatement("SELECT * FROM MAPSA.PERSON ORDER BY income DESC") : null;
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
        }
        System.out.println(listConvertor(list));

    }
}
