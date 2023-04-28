package com.corvanta.hostel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Rooms;

@RepositoryRestResource()
public interface RoomsRepository extends JpaRepository<Rooms, Integer>, JpaSpecificationExecutor<Rooms>,
		QuerydslPredicateExecutor<Rooms> {

	List<Rooms> findByLocationIdAndServiceApartmentId(int locationId,int serviceApartmentId);

}
