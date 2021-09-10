package com.fullappspring.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullappspring.fleetapp.models.Vehicle;

 @Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
