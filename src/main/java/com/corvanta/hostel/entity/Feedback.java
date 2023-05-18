package com.corvanta.hostel.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Feedback {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	@NotNull(message = "{NotNull.Feedback.name}")
	private String name;

	@Column
	@NotNull(message = "{NotNull.Feedback.feedback}")
	private String feedback;

	@Column
	@NotNull(message = "{NotNull.Feedback.complaints}")
	private String complaints;
	

	@Column
	@NotNull(message = "{NotNull.Feedback.date}")
	private Date date;

	@Column
	@NotNull(message = "{NotNull.Feedback.Status}")
	private String status;

	
}
 