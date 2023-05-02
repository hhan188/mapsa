package practices.practice9.interface1.exercise1;

import java.util.List;

public interface Sortable <T,U extends T>{
    T[] compare(U[] u);
}
