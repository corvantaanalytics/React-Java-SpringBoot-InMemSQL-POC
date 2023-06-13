package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
@Table(name = "room")
public class Rooms {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.Rooms.locationId}")
	private int locationId;
	
	@Column
	@NotNull(message = "{NotNull.Rooms.location}")
	private String location;


	@Column
	@NotNull(message = "{NotNull.Rooms.serviceApartmentId}")
	private int serviceApartmentId;
	
	@Column
	@NotNull(message = "{NotNull.Rooms.serviceApartment}")
	private String serviceApartment;

	@Column
	@NotNull(message = "{NotNull.Rooms.address}")
	private String address;

	
	@Column
	@NotNull(message = "{NotNull.Rooms.roomtypes}")
	private String roomTypes;

	@Column
	@NotNull(message = "{NotNull.Rooms.rent}")
	private long rent;
}
