package practices.practice10.exercise42;

import java.util.List;

public interface ISaveAble<S> {
    List<S> write();
    List<S> read();


}
