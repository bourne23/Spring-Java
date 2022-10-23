package com.foxborn.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="regions")
@NoArgsConstructor
@Data
public class Region extends BaseEntity {

    private String region;
    private String country;

    @OneToOne(mappedBy = "region")  //mappedby' should be used in bi-directional relationship.
    private Employee employee;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
