package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Location;
import com.corvanta.hostel.entity.ServiceApartments;

@RepositoryRestResource()
public interface ServiceApartmentsRepository extends JpaRepository<ServiceApartments, Integer>, JpaSpecificationExecutor<ServiceApartments>,
		QuerydslPredicateExecutor<ServiceApartments> {
}