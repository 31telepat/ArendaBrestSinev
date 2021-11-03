package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String adress;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "flat_id")
    private List<Flat> flats;

    public Person() {
    }

    public Person(String name, int age, String adress) {
        this.name = name;
        this.age = age;
        this.adress = adress;
        flats = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List<Flat> getFlats() {
        return flats;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + adress;
    }


}
