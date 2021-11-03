package dao;

import models.House;
import models.Flat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.jms.Session;
import javax.transaction.Transaction;
import java.util.List;

public class HouseDao {

    public House findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(House.class, id);
    }

    public void save(House house) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(house);
        tx1.commit();
        session.close();
    }

    public void update(House house) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(house);
        tx1.commit();
        session.close();
    }

    public void delete(House house) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(house);
        tx1.commit();
        session.close();
    }

    public Flat findFlatById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Flat.class, id);
    }

    public List<House> findAll() {
        List<House> houses = (List<House>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From House").list();
        return houses;
    }
}

