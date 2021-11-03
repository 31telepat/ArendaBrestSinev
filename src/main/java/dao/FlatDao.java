package dao;

import models.Person;
import models.Flat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

import javax.jms.Session;
import javax.transaction.Transaction;
import java.util.List;

public class FlatDao {

    public Flat findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Flat.class, id);
    }

    public void save(Flat flat) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(flat);
        tx1.commit();
        session.close();
    }

    public void update(Flat flat) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(flat);
        tx1.commit();
        session.close();
    }

    public void delete(Flat flat) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(flat);
        tx1.commit();
        session.close();
    }

    public Person findPersonById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Person.class, id);
    }

    public List<Flat> findAll() {
        List<Flat> flats = (List<Flat>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From Flat").list();
        return flats;
    }
}
