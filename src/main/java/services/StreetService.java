package services;

import dao.StreetDao;
import models.House;
import models.Street;

import java.util.List;

public class StreetService {

    private StreetDao streetDao = new StreetDao();

    public StreetService() {
    }

    public Street findStreet(int id) {
        return streetDao.findById(id);
    }

    public void saveStreet(Street street) {
        streetDao.save(street);
    }

    public void deleteStreet(Street street) {
        streetDao.delete(street);
    }

    public void updateStreet(Street street) {
        streetDao.update(street);
    }

    public List<Street> findAllStreets() {
        return streetDao.findAll();
    }

    public House findHouseById(int id) {
        return streetDao.findHouseById(id);
    }
}
