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
@Table(name = "locations")
public class Location {
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @Column(name = "STATE", length = 250, nullable = false)
	    @NotNull(message = "{NotNull.Location.state}")
	    private String state;

	    @Column(name = "DISTRICT", length = 250, nullable = false)
	    @NotNull(message = "{NotNull.Location.district}")
	    private String district;

	    @Column(name = "LOCATION", length = 250, nullable = false)
	    @NotNull(message = "{NotNull.Location.location}")
	    private String location;

}
