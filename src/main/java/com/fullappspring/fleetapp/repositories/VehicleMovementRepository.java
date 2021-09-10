package com.fullappspring.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullappspring.fleetapp.models.VehicleMovement;

 @Repository
public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Integer> {

}
