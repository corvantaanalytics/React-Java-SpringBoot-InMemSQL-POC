package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class ServiceApartments {
	
	@Id
	@Column
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.ServiceApartments.locationId}")
	private int locationId;

	@Column
	@NotNull(message = "{NotNull.ServiceApartments.name}")
	private String name;

	@Column
	@NotNull(message = "{NotNull.ServiceApartments.address}")
	private String address;

	
}

