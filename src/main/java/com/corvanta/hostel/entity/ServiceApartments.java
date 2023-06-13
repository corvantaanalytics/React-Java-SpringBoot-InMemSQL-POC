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
@Table(name = "apartment")
public class ServiceApartments {
	
	@Id
	@Column
	
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.ServiceApartments.locationId}")
	private int locationId;

	@Column
	@NotNull(message = "{NotNull.ServiceApartments.location}")
	private String location;
	
	@Column
	@NotNull(message = "{NotNull.ServiceApartments.name}")
	private String name;

	@Column
	@NotNull(message = "{NotNull.ServiceApartments.address}")
	private String address;

	
}

