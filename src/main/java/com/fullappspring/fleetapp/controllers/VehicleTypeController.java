package com.fullappspring.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping("/vehicleTypes")
	public String getVehiclesType() {
		return "VehicleType";
	}
}
