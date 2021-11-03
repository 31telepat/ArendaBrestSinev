package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "flat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number_of_rooms")
    private int number_of_rooms;

    @Column(name = "cost")
    private float cost;

    @Column(name = "area")
    private float area;

    @Column(name = "owner")
    private String owner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "house_id")
    private House house;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    private List<Person> persons;
}
