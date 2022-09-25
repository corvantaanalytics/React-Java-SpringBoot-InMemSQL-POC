package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class RoomDetail {

	@Id
	@Column
	private int id;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.address}")
	private String address;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.housename}")
	private String houseName;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.roomtypes}")
	private String roomTypes;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.rent}")
	private long rent;
}
