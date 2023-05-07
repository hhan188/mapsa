package Prac10.P47;

import java.util.List;

public interface ISaveable {
    public <T extends List<String>> T write();
    public <T extends List<String>> void read(T strings);
}
