package Practice9.Generics.Five;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

public class CollectionUtils<T, R> {

    public Collection<R> mapper(Collection<T> collection, Function<T,R> mapper) {

        Collection<R> result = new ArrayList<>();
        for (T item : collection) {
            R transformedItem = mapper.apply(item);
            result.add(transformedItem);
        }
        return result;
    }
}