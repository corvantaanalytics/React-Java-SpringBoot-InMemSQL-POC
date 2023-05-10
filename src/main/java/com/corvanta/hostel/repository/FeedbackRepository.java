package com.corvanta.hostel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.corvanta.hostel.entity.Feedback;
import com.corvanta.hostel.entity.Hosteller;

@RepositoryRestResource()
public interface FeedbackRepository extends JpaRepository<Feedback, Integer>, JpaSpecificationExecutor<Feedback>,
		QuerydslPredicateExecutor<Feedback> {
	Feedback deleteById(int id);
}
