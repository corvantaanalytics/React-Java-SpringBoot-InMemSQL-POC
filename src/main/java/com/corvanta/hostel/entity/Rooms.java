package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Rooms {

	@Id
	@Column
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.Rooms.locationId}")
	private int locationId;

	@Column
	@NotNull(message = "{NotNull.Rooms.serviceApartmentId}")
	private int serviceApartmentId;


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
