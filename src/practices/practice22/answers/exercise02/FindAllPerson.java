package practices.practice22.answers.exercise02;

import practices.practice22.entity.Person;
import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FindAllPerson {
    protected static List<Person> findAllPerson() {
        try {
            Connection connection = JDBCConnection.getConnection();
            PreparedStatement ps = connection != null ? connection.prepareStatement("SELECT * FROM MAPSA.PERSON ORDER BY AGE ASC") : null;
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
            return list;
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
