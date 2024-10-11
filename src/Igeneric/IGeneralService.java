package Igeneric;

import java.util.List;

public interface IGeneralService<T> {
    List<T> getAll();
    T getById(String id);
    T getByName(String name);
    void update(T entity);
    void delete(String id);
}

