package com.corvanta.hostel.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class RoomRequest {

	@Id
	@Column
	private int id;

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.name}")
	private String name;

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.roomDetails}")
	private String roomDetails;

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.dateOfRequest}")
	private Date dateOfRequest;
	

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.dateOfCompletion}")
	private Date dateOfCompletion;

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.Status}")
	private String status;

	@Column
	@NotNull(message = "{NotNull.RoomCleaning.UpdateRequest}")
	private String updateRequest;

}
 