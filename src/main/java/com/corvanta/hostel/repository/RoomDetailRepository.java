package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.RoomDetail;

@RepositoryRestResource()
public interface RoomDetailRepository extends JpaRepository<RoomDetail, Integer>, JpaSpecificationExecutor<RoomDetail>,
		QuerydslPredicateExecutor<RoomDetail> {
}
