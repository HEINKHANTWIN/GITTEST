package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParkingSpace {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int lot;
	private String location;
	
	@OneToOne(mappedBy = "pSpace")
	private Employee employee;
	
	public ParkingSpace() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParkingSpace(int lot, String location, Employee employee) {
		super();
		this.lot = lot;
		this.location = location;
		this.employee = employee;
	}
	
	public ParkingSpace(int lot, String location) {
		super();
		this.lot = lot;
		this.location = location;
	}

	@Override
	public String toString() {
		return "ParkingSpace [id=" + id + ", lot=" + lot + ", location=" + location + ", employee=" + employee + "]";
	}
}
