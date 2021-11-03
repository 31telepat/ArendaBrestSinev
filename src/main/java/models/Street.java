package models;

import javax.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "metro")
    private String metro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "street", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<House> houses;
}
