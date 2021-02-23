package com.springboot.parkinglot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.parkinglot.model.MyIntro;
import com.springboot.parkinglot.model.VehicleDTO;
import com.springboot.parkinglot.services.ParkingService;

@RestController
@RequestMapping("/parkinglot")
public class ParkingLotController {
	
	/*
	 * @GetMapping("/aboutMe") public MyIntro aboutMe() { return
	 * MyIntro.builder().name("Ashish").age(25).skills("Java and SpringBoot").build(
	 * );
	 * 
	 * }
	 * 
	 * @PostMapping("/infoAboutSomeone") public MyIntro infoAboutSomeone(String
	 * name, int age, String skills) { return
	 * MyIntro.builder().name(name).age(age).skills(skills).build(); }
	 */
	@Autowired
	ParkingService parkingService;
	
	@GetMapping("/parkingInfo")
	public List<VehicleDTO> getAllVehicles() {
		return parkingService.getAllVehicles();
	}
	
	@PostMapping("/park")
	public String park(VehicleDTO vehicleDTO) {
		return parkingService.park(vehicleDTO);
	}
	
	@DeleteMapping("/unpark")
	public String unpark(Long id) {
		return parkingService.unpark(id);
	}
}
