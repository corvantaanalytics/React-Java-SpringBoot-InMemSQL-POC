package com.corvanta.hostel.entity;

import java.util.Date;

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
@Table(name = "service_request")


public class ServiceRequest {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	@NotNull(message = "{NotNull.ServiceRequest.userId}")
	private int userId;


	@Column
	@NotNull(message = "{NotNull.ServiceRequest.userName}")
	private String userName;


	@Column
	@NotNull(message = "{NotNull.ServiceRequest.roomDetail}")
	private String roomdetail;

	@Column
	@NotNull(message = "{NotNull.ServiceRequest.dateOfRequest}")
	private Date dateOfRequest;
	

	@Column
	@NotNull(message = "{NotNull.ServiceRequest.dateOfCompletion}")
	private Date dateOfCompletion;

	@Column
	@NotNull(message = "{NotNull.ServiceRequest.Status}")
	private String status;

}
 