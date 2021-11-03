package dao;

import models.House;
import models.Street;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;
import java.util.List;

public class StreetDao {

    public Street findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Street.class, id);
    }

    public void save(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(street);
        tx1.commit();
        session.close();
    }

    public void update(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(street);
        tx1.commit();
        session.close();
    }

    public void delete(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(street);
        tx1.commit();
        session.close();
    }

    public House findHouseById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(House.class, id);
    }

    public List<Street> findAll() {
        List<Street> streets = (List<Street>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Street").list();
        return streets;
    }
}
