package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.UserExpenses;
import com.corvanta.hostel.repository.UserExpensesRepository;

@Component
public class UserExpensesService {

	private UserExpensesRepository userExpensesRepository;

	public UserExpensesService(UserExpensesRepository userExpensesRepository) {
		this.userExpensesRepository = userExpensesRepository;
	}

	public UserExpenses saveUserExpenses(UserExpenses userExpenses) {
		userExpenses.setDate(java.time.LocalDate.now());
		return userExpensesRepository.save(userExpenses);
	}

	public List<UserExpenses> getUserExpensesByLocationId(int locationId) {

		return userExpensesRepository.findByLocationId(locationId);
	}

	public List<UserExpenses> getUserExpensesByApartmentId(int serviceApartmentId) {

		return userExpensesRepository.findByServiceApartmentId(serviceApartmentId);
	}

	public List<UserExpenses> getUserExpensesByRoomId(int roomId) {

		return userExpensesRepository.findByRoomId(roomId);
	}

	public List<UserExpenses> getUserExpensesByExpenseId(int expenseId) {

		return userExpensesRepository.findByExpenseId(expenseId);
	}

}
