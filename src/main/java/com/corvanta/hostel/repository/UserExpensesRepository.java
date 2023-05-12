package com.corvanta.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.ServiceApartments;
import com.corvanta.hostel.entity.ServiceRequest;
import com.corvanta.hostel.entity.UserExpenses;

@RepositoryRestResource()
public interface UserExpensesRepository extends JpaRepository<UserExpenses, Integer>,
		JpaSpecificationExecutor<UserExpenses>, QuerydslPredicateExecutor<UserExpenses> {
	
	List<UserExpenses> findByLocationId(int locationId);
	List<UserExpenses> findByServiceApartmentId(int serviceApartmentId);
	List<UserExpenses> findByExpenseTypeId(int expenseId);
}

