package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import dao.AbstractEntity;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "adress")
    private String adress;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "flat_id")
    private List<Flat> flats;
}
