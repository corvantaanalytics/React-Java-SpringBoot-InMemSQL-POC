package com.corvanta.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.UserExpenses;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.UserExpensesService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class UserExpensesController {

	@Autowired
	UserExpensesService userExpensesService;
	
	@GetMapping(path = HostellerLinks.GET_USEREXPENSES)
	public ResponseEntity<?> listUserExpenses() {
		log.info("UserExpensesController:  list UserExpenses");
		List<UserExpenses> resource = userExpensesService.getUserExpenses();
		return ResponseEntity.ok(resource);
	}


	@PostMapping(path = HostellerLinks.ADD_USEREXPENSE)
	public ResponseEntity<?> saveUserExpense(@RequestBody UserExpenses userExpenses) {
		log.info("UserExpensesController:  saveUserExpense");
		UserExpenses resource = userExpensesService.saveUserExpenses(userExpenses);
		return ResponseEntity.ok(resource);
	}
	

	@GetMapping(path = HostellerLinks.GET_USEREXPENSEBYLOCATION)
	public ResponseEntity<?> getUserExpenseByLocation(@PathVariable("locationId") int locationId) {
		log.info("UserExpensesController:  getUserExpenseByLocationId :: " + locationId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByLocationId(locationId);
		return ResponseEntity.ok(resource);
	}
	
	@GetMapping(path = HostellerLinks.GET_USEREXPENSEBYAPARTMENT)
	public ResponseEntity<?> getUserExpenseByApartment(@PathVariable("serviceApartmentId") int serviceApartmentId) {
		log.info("UserExpensesController:  getUserExpenseByLocationId :: " + serviceApartmentId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByApartmentId(serviceApartmentId);
		return ResponseEntity.ok(resource);
	}
	
	@GetMapping(path = HostellerLinks.GET_USEREXPENSEBYEXPENSE)
	public ResponseEntity<?> getUserExpenseByExpense(@PathVariable("expenseId") int expenseTypeId) {
		log.info("UserExpensesController:  getUserExpenseByLocationId :: " + expenseTypeId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByExpenseId(expenseTypeId);
		return ResponseEntity.ok(resource);
	}

}
