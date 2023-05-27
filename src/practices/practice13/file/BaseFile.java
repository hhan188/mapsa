package practices.practice13.file;

import practices.practice13.controller.CustomIOException;
import practices.practice13.utils.TheaterUtils;

public interface BaseFile<T extends TheaterUtils> {
    void fileUtil(T t) throws CustomIOException;


}
