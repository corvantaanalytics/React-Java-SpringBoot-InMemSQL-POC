package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.ServiceRequest;

@RepositoryRestResource()
public interface ServiceRequestRepository extends JpaRepository<ServiceRequest, Integer>,
		JpaSpecificationExecutor<ServiceRequest>, QuerydslPredicateExecutor<ServiceRequest> {
	
	ServiceRequest deleteById(int id);
}
