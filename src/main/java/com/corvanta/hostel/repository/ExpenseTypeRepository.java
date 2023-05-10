package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.ExpenseType;
import com.corvanta.hostel.entity.Hosteller;

@RepositoryRestResource()
public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Integer>, JpaSpecificationExecutor<ExpenseType>,
		QuerydslPredicateExecutor<ExpenseType> {
	
	ExpenseType deleteById(int id);
}
