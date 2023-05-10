package com.corvanta.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corvanta.hostel.entity.ExpenseType;
import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.ExpenseTypeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class ExpenseTypeController {

	@Autowired
	ExpenseTypeService expenseTypeService;

	@GetMapping(path = HostellerLinks.LIST_EXPENSETYPES)
	public ResponseEntity<?> getExpenseTypes() {
		log.info("ExpenseTypeController:  get ExpenseTypes");
		List<ExpenseType> resource = expenseTypeService.getAllExpenseTypes();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_EXPENSETYPE)
	public ResponseEntity<?> saveExpenseType(@RequestBody ExpenseType expenseType) {
		log.info("ExpenseTypeController:  saveExpenseType");
		ExpenseType resource = expenseTypeService.saveExpenseType(expenseType);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_EXPENSETYPE)
	public ResponseEntity<?> getExpenseType(@PathVariable("id") int id) {
		log.info("ExpenseTypeController:  getExpenseType :: " + id);
		ExpenseType resource = expenseTypeService.getExpenseType(id);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_EXPENSETYPE)
	public ResponseEntity<?> updateExpenseType(@PathVariable("id") int id, @RequestBody ExpenseType expenseType) {
		log.info("ExpenseTypeController: updateExpenseType:: " + id);
		ExpenseType resource = expenseTypeService.updateExpenseType(id, expenseType);
		return ResponseEntity.ok(resource);
	}
	
	@DeleteMapping(path = HostellerLinks.DELETE_EXPENSETYPE)
	public ResponseEntity<?> deleteExpenseType(@PathVariable("id") int id) {
		log.info("ExpenseTypeController: deleteExpenseType :: " + id);
		ExpenseType resource = expenseTypeService.deleteExpenseType(id);
		return ResponseEntity.ok(resource);

}
	
}

