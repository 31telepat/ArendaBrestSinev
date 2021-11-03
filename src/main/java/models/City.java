package models;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Data
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
}
