package com.corvanta.hostel.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class UserExpenses {

	@Id
	@Column
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.locationId}")
	private int locationId;

	@Column
	@NotNull(message = "{NotNull.UserExpenses.serviceApartmentId}")
	private int serviceApartmentId;


	@Column
	@NotNull(message = "{NotNull.UserExpenses.address}")
	private int roomId;

	
	@Column
	@NotNull(message = "{NotNull.UserExpenses.roomtypes}")
	private int expenseId;

	@Column
	@NotNull(message = "{NotNull.UserExpenses.rent}")
	private long amount;
	

	 @JsonFormat(pattern="yyyy-MM-dd")
	 private LocalDate date;

}

