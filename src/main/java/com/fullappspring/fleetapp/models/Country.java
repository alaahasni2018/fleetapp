package com.fullappspring.fleetapp.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country { 
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public  Integer id;
	public  String code;
	public  String capital;
	public  String description;
	public String nationality;
	public String continent;
	
	@OneToMany(mappedBy="country")
	private List<State> state;

}
