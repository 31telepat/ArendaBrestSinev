package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Street> streets;

    public City() {
    }

    public City(String name) {
        this.name = name;
        streets = new ArrayList<>();
    }

    public void addStreet(Street street) {
        street.setCity(this);
        streets.add(street);
    }

    public void removeStreet(Street auto) {
        streets.remove(auto);
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

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @Override
    public String toString() {
        return "models.City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
