package practices.practice22.answers.exercise20;

public class Main {

    private static final String query = "DELETE FROM PERSON WHERE id NOT IN " +
            "( SELECT id FROM" +
            " (SELECT MIN(id) AS id FROM person GROUP BY name ) AS c)";

    //Delete all persons whose names are duplicated in the table, keeping only one instance of each name
    public static void main(String[] args) {


    }
}
