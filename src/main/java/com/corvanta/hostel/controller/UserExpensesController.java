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
		log.info("LocationController:  getUserExpenseByLocationId :: " + serviceApartmentId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByApartmentId(serviceApartmentId);
		return ResponseEntity.ok(resource);
	}
	
	@GetMapping(path = HostellerLinks.GET_USEREXPENSEBYROOM)
	public ResponseEntity<?> getUserExpenseByRoom(@PathVariable("roomId") int roomId) {
		log.info("LocationController:  getUserExpenseByLocationId :: " + roomId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByRoomId(roomId);
		return ResponseEntity.ok(resource);
	}
	
	@GetMapping(path = HostellerLinks.GET_USEREXPENSEBYEXPENSE)
	public ResponseEntity<?> getUserExpenseByExpense(@PathVariable("expenseId") int expenseId) {
		log.info("LocationController:  getUserExpenseByLocationId :: " + expenseId);
		List<UserExpenses> resource = userExpensesService.getUserExpensesByExpenseId(expenseId);
		return ResponseEntity.ok(resource);
	}

}
