package com.fullappspring.fleetapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullappspring.fleetapp.models.Country;
import com.fullappspring.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository ; 
	
	//return list of countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
		
	}
	
	//add new country 
	public void save (Country country) {
		countryRepository.save(country);
	}

}
