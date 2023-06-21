package practices.practice22.dto;

import java.util.List;

public abstract class BaseDao<T> {

    public abstract List<T> findAll();





}
