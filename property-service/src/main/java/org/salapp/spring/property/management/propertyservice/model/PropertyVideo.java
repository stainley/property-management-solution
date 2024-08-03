package org.salapp.spring.property.management.propertyservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Video {

    @Id
    private Long id;
    private Long propertyId;
    private String url;

}
