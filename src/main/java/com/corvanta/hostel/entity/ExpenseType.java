package com.corvanta.hostel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class ExpenseType {
	
	@Id
	@Column
	private int id;

	@Column
	@NotNull(message = "{NotNull.ExpenseType.expenseType}")
	private String expenseType;
//
//	@Column
//	@NotNull(message = "{NotNull.ExpenseType.food}")
//	private String food;
//
//	@Column
//	@NotNull(message = "{NotNull.ExpenseType.electricity}")
//	private String electricity;
//	
//
//	@Column
//	@NotNull(message = "{NotNull.ExpenseType.maintenance}")
//	private String maintenance;

}
