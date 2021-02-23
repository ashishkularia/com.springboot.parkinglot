package com.springboot.parkinglot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class VehicleDTO {
	
	private String vehicleNumber;
	private String ownerName;
	@Id
	private Long id;
}
