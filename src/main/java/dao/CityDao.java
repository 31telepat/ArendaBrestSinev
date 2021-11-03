package dao;

import models.City;
import models.Street;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.jms.Session;
import javax.transaction.Transaction;
import java.util.List;

public class CityDao {

    public City findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(City.class, id);
    }

    public void save(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(city);
        tx1.commit();
        session.close();
    }

    public void update(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(city);
        tx1.commit();
        session.close();
    }

    public void delete(City city) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(city);
        tx1.commit();
        session.close();
    }

    public Street findStreetById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Street.class, id);
    }

    public List<City> findAll() {
        List<City> cities = (List<City>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From City").list();
        return cities;
    }
}
