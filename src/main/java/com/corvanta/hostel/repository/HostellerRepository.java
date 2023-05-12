package com.corvanta.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.Rooms;
import com.corvanta.hostel.entity.UserExpenses;

@RepositoryRestResource()
public interface HostellerRepository extends JpaRepository<Hosteller, Integer>, JpaSpecificationExecutor<Hosteller>,
		QuerydslPredicateExecutor<Hosteller> {
	
	Hosteller deleteById(int id);
	List<Hosteller> findByLocationIdAndServiceApartmentId(int locationId,int serviceApartmentId);
	List<Hosteller> findByLocationId(int locationId);
	List<Hosteller> findByServiceApartmentId(int serviceApartmentId);
}
