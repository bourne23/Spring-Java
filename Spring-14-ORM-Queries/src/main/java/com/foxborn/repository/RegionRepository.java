package com.foxborn.repository;

import com.foxborn.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);  // select * from region where country=" "

    //Display all regions in Canada, without duplicates
    List<Region> findDistinctByCountry(String country);

    //Display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order
    List<Region> findByCountryContainingOrderByCountry(String country);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);



}
