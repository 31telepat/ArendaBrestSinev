package services;

import dao.AbstractEntity;
import java.util.List;

public interface Service <E extends AbstractEntity>{

    E find(int id);

    void save(E entity);

    void delete(E entity);

    void update(E entity);

    List<E> findAll();
}
