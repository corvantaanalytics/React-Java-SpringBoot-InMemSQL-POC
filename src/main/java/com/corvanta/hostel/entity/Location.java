package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Location {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@NotNull(message = "{NotNull.Location.state}")
	private String state;

	@Column
	@NotNull(message = "{NotNull.Location.district}")
	private String district;

	@Column
	@NotNull(message = "{NotNull.Location.location}")
	private String location;

}
