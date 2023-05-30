package tamrin16.p6;

import java.util.ArrayList;
import java.util.List;

public class IncrementListTransformer implements ListTransformer {

    @Override
    public List<Integer> transform(List<Integer> numbers) {

        List<Integer> transformed = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            transformed.add(i, numbers.get(i) + 1);
        }

        return transformed;
    }
}
