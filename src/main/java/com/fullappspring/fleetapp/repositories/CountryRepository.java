package com.fullappspring.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullappspring.fleetapp.models.Country;

 @Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
