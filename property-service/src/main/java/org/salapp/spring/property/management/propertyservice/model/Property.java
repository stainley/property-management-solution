package org.salapp.spring.property.management.propertyservice.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "properties")
public class PropertyPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;
    private int size;
    private String address;
    private String type;
    private String status;
    private BigDecimal price;
    private LocalDateTime dateListed;

}
