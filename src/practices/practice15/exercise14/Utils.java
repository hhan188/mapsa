package practices.practice15.exercise14;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    protected static List<String> filterStateNames(List<String> states, String roles) {

        switch (roles) {
            case "abb": {
                List<String> abbList = new ArrayList<>();
                for (int i = 0; i < states.size(); i++) {
                    if (states.get(i).length() == 2) {
                        abbList.add(states.get(i));
                    }

                }
                return abbList;

            }
            case "full": {
                List<String> fullList = new ArrayList<>();
                for (int i = 0; i < states.size(); i++) {
                    if (states.get(i).length() != 2) {
                        fullList.add(states.get(i));
                    }

                }
                return fullList;

            }
            default:
                return null;
        }


    }
}
