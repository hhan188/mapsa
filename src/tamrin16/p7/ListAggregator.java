package tamrin16.p7;

import java.util.List;

@FunctionalInterface
public interface ListAggregator<T, R> {
    //functional interface
    R aggregate(List<T> list);
}
