package models;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "house")
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "number_of_flats")
    private int number_of_flats;

    @Column(name = "number_of_floors")
    private int number_of_floors;

    @Column(name = "material")
    private String material;

    @Column(name = "construction_year")
    private int construction_year;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "street_id")
    private Street street;

    @OneToMany(mappedBy = "house", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Flat> flats;
}
