package services;

import dao.HouseDao;
import models.House;
import models.Flat;

import java.util.List;

public class HouseService {

    private HouseDao houseDao = new HouseDao();

    public HouseService() {
    }

    public House findHouse(int id) {
        return houseDao.findById(id);
    }

    public void saveHouse(House house) {
        houseDao.save(house);
    }

    public void deleteHouse(House house) {
        houseDao.delete(house);
    }

    public void updateHouse(House house) {
        houseDao.update(house);
    }

    public List<House> findAllHouses() {
        return houseDao.findAll();
    }

    public Flat findFlatById(int id) {
        return houseDao.findFlatById(id);
    }
}

