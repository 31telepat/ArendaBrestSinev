package dao;

import java.util.List;

public interface Dao <E extends AbstractEntity> {
    void save(E entity); // должен возврать сущность

    E findById(int id); // должен возврать сущность

    void update(E entity); // должен возврать сущность

    void delete(E entity);

    List<E> findAll();
}
