package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.ExpenseType;
import com.corvanta.hostel.repository.ExpenseTypeRepository;

@Component
public class ExpenseTypeService {

	private ExpenseTypeRepository expenseTypeRepository;

	public ExpenseTypeService(ExpenseTypeRepository expenseTypeRepository) {
		this.expenseTypeRepository = expenseTypeRepository;
	}

	public List<ExpenseType> getAllExpenseTypes() {
		return expenseTypeRepository.findAll();
	}

	public ExpenseType saveExpenseType(ExpenseType expenseType) {
		return expenseTypeRepository.save(expenseType);
	}

	public ExpenseType getExpenseType(int id) {
		return expenseTypeRepository.findById(id).get();
	}

	public ExpenseType updateExpenseType(int id, ExpenseType expenseType) {
		expenseType.setId(id);
		return expenseTypeRepository.save(expenseType);
	}
}
