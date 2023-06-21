package practices.practice22.answers.exercise09;


import practices.practice22.utils.JDBCConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//9 - Retrieve the persons and their respective count of posts.

public class Main {
    public static void main(String[] args) throws SQLException {
        String query = "select person.id as person_id_in_person,p.person_id as person_id_in_post,name,gender,p.title" +
                " from person inner join post p  on  person.id = p.person_id";
        StringBuilder builder = new StringBuilder();
        Connection connection = JDBCConnection.getConnection();
        assert connection != null;
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet result = ps.executeQuery();
        while (result.next()) {
            builder.append("Id In Person Table: ")
                    .append(result.getInt("person_id_in_person"))
                    .append(", Id In Post Table: ")
                    .append(result.getInt("person_id_in_post"))
                    .append(", Name: ")
                    .append(result.getString("PERSON.NAME"))
                    .append(", Gender: ")
                    .append(result.getString("GENDER"))
                    .append(", Title: ")
                    .append(result.getString("TITLE"))
                    .append("\n");
        }
        ps.close();
        System.out.println(builder);
    }
}
