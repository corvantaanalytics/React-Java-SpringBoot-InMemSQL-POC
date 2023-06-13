package com.corvanta.hostel.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
@Table(name = "expense")

public class UserExpenses {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.locationId}")
	private int locationId;
	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.location}")
	private String location;

	@Column
	@NotNull(message = "{NotNull.UserExpenses.serviceApartmentId}")
	private int serviceApartmentId;
	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.locationId}")
	private String serviceApartment;

	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.roomtypes}")
	private int expenseTypeId;
	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.locationId}")
	private String expenseType;

	@Column
	@NotNull(message = "{NotNull.UserExpenses.rent}")
	private long amount;
	

	 @JsonFormat(pattern="yyyy-MM-dd")
	 private LocalDate date;

}

