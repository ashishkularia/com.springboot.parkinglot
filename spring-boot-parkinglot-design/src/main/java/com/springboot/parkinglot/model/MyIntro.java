package com.springboot.parkinglot.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MyIntro {

	private String name;
	private int age;
	private String skills;
}
