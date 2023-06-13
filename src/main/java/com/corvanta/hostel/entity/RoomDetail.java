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
@Table(name = "room_detail")
public class RoomDetail {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.address}")
	private String address;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.houseName}")
	private String houseName;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.roomTypes}")
	private String roomTypes;

	@Column
	@NotNull(message = "{NotNull.RoomDetail.rent}")
	private long rent;
}
