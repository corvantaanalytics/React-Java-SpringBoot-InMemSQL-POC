package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.ServiceApartments;
import com.corvanta.hostel.entity.UserExpenses;
import com.corvanta.hostel.repository.UserExpensesRepository;

@Component
public class UserExpensesService {

	private UserExpensesRepository userExpensesRepository;

	public UserExpensesService(UserExpensesRepository userExpensesRepository) {
		this.userExpensesRepository = userExpensesRepository;
	}
	
	public List<UserExpenses> getUserExpenses() {
		return userExpensesRepository.findAll();
	}

	public UserExpenses saveUserExpenses(UserExpenses userExpenses) {
		return userExpensesRepository.save(userExpenses);
	}

	public List<UserExpenses> getUserExpensesByLocationId(int locationId) {

		return userExpensesRepository.findByLocationId(locationId);
	}
	
	public UserExpenses getUserExpensesById(int id) {
		return userExpensesRepository.findById(id).get();
	}

	public List<UserExpenses> getUserExpensesByApartmentId(int serviceApartmentId) {

		return userExpensesRepository.findByServiceApartmentId(serviceApartmentId);
	}

	public List<UserExpenses> getUserExpensesByExpenseId(int expenseTypeId) {

		return userExpensesRepository.findByExpenseTypeId(expenseTypeId);
	}
	
	public UserExpenses updateUserExpenses(int id, UserExpenses userExpenses) {
		userExpenses.setId(id);
		return userExpensesRepository.save(userExpenses);
	}
	
	public UserExpenses deleteUserExpense(int id) {
		return userExpensesRepository.deleteById(id);
	}

}
