package com.fullappspring.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fullappspring.fleetapp.models.Contact;

 @Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
