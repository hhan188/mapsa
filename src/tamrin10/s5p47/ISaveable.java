package tamrin10.s5p47;

import java.util.List;

public interface ISaveable {

    List<String> write();

    void read(List<String> list);

}
