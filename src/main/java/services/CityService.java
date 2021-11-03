package services;

import dao.CityDao;
import models.City;
import models.Street;

import java.util.List;

public class CityService {

    private CityDao cityDao = new CityDao();

    public CityService() {
    }

    public City findCity(int id) {
        return cityDao.findById(id);
    }

    public void saveCity(City city) {
        cityDao.save(city);
    }

    public void deleteCity(City city) {
        cityDao.delete(city);
    }

    public void updateCity(City city) {
        cityDao.update(city);
    }

    public List<City> findAllCities() {
        return cityDao.findAll();
    }

    public Street findStreetById(int id) {
        return cityDao.findStreetById(id);
    }
}
