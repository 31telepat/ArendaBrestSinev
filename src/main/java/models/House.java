package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int number_of_flats;
    private int number_of_floors;
    private String material;
    private int construction_year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street_id")
    private Street street;

    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Flat> flats;

    public House() {
    }

    public House(int number_of_flats, int number_of_floors, String material, int construction_year) {
        this.number_of_flats = number_of_flats;
        this.number_of_floors = number_of_floors;
        this.material = material;
        this.construction_year = construction_year;
        flats = new ArrayList<>();
    }

    public int getId() {
        return id;
    }
    public int getNumber_of_flats() {
        return number_of_flats;
    }

    public void setNumber_of_flats(int number_of_flats) {
        this.number_of_flats = number_of_flats;
    }

    public int getNumber_of_floors() {
        return number_of_floors;
    }

    public void setNumber_of_floors(int number_of_floors) {
        this.number_of_floors = number_of_floors;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getConstruction_year() {
        return construction_year;
    }

    public void setConstruction_year(int construction_year) {
        this.construction_year = construction_year;
    }

    public Street getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return number_of_flats + " " + number_of_floors + " " + material + " " + construction_year;
    }
}
