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
	@NotNull(message = "{NotNull.RoomRequest.name}")
	private String name;

	@Column
	@NotNull(message = "{NotNull.RoomRequest.roomDetails}")
	private String roomDetails;

	@Column
	@NotNull(message = "{NotNull.RoomRequest.dateOfRequest}")
	private Date dateOfRequest;
	

	@Column
	@NotNull(message = "{NotNull.RoomRequest.dateOfCompletion}")
	private Date dateOfCompletion;

	@Column
	@NotNull(message = "{NotNull.RoomRequest.Status}")
	private String status;

	@Column
	@NotNull(message = "{NotNull.RoomRequest.UpdateRequest}")
	private String updateRequest;

}
 