package practices.practice15.exercise14;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    protected static List<String> filterStateNames(List<String> states, String roles) {

        switch (roles) {
            case "abb": {
                List<String> abbList = new ArrayList<>();
                for (String state : states) {
                    if (state.length() == 2) {
                        abbList.add(state);
                    }

                }
                return abbList;

            }
            case "full": {
                List<String> fullList = new ArrayList<>();
                for (String state : states) {
                    if (state.length() != 2) {
                        fullList.add(state);
                    }

                }
                return fullList;

            }
            default:
                return null;
        }


    }
}
