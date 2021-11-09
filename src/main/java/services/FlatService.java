package services;

import dao.FlatDao;
import lombok.NoArgsConstructor;
import models.Flat;

import java.util.List;

@NoArgsConstructor
public class FlatService implements Service<Flat> {

    private FlatDao flatDao;

    @Override
    public Flat find(int id) {
        return flatDao.findById(id);
    }

    @Override
    public void save(Flat flat) {
        flatDao.save(flat);
    }

    @Override
    public void delete(Flat flat) {
        flatDao.delete(flat);
    }

    @Override
    public void update(Flat flat) {
        flatDao.update(flat);
    }

    @Override
    public List<Flat> findAll() {
        return flatDao.findAll();
    }
}
