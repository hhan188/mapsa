package practices.practice22.utils;

import java.util.List;

public class StringBuild {

    public static String listConvertor(List<?> list) {
        StringBuilder builder = new StringBuilder();
        for (Object o : list) {
            builder.append(o).append("\n");
        }
        return builder.toString();
    }
}
