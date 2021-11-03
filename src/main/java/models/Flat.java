package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "flat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number_of_rooms;
    private float cost;
    private float area;
    private String owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "house_id")
    private House house;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    private List<Person> persons;

    public Flat() {
    }

    public Flat(int number_of_rooms, float cost, float area, String owner) {
        this.number_of_rooms = number_of_rooms;
        this.cost = cost;
        this.area = area;
        this.owner = owner;
        persons = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public House getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return number_of_rooms + " " + cost + " " + area + " " + owner;
    }
}
