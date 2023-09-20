package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display all regions in Canada
    List<Region> findByCountry(String country);
    List<Region> getByCountry(String country);

    //Display all regions with country name includes 'United'
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes 'United' in order (region)
    List<Region> findByCountryContainingOrderByRegionDesc(String country);

    //Display top two regions in US
    List<Region> findTopByCountry(String country); // first one
    List<Region> findTop2ByCountry(String country); // first two TopN pcs

    List<Region> findTopByCountryContainsOrderByRegion(String country);

}
