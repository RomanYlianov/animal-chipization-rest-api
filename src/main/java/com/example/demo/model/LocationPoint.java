package com.example.demo.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

/**
 * сущность LocationPoint
 * @author ROMAN
 * @date 2023-02-17
 * @version 1.0
 */
@Data
@Entity
@Table(name = "location_point")
public class LocationPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "latitude", nullable = false)
    private Double latitude;

    @Column(name = "longitude", nullable = false)
    private Double longitude;

    @OneToMany(mappedBy = "locationPoint", fetch = FetchType.LAZY)
    Set<AnimalVisitedLocation> locations;

    @OneToMany(mappedBy = "chippingLocationId")
    private Set<Animal> animals;
}
