package services;

import dao.PersonDao;
import lombok.NoArgsConstructor;
import models.Flat;
import models.Person;

import java.util.List;

@NoArgsConstructor
public class PersonService implements Service<Person>{

    private PersonDao personDao;

    @Override
    public Person find(int id) {
        return personDao.findById(id);
    }

    @Override
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    public void delete(Person person) {
        personDao.delete(person);
    }

    @Override
    public void update(Person person) {
        personDao.update(person);
    }

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }
}
