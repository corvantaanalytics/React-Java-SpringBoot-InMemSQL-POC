package com.womenhostel.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.womenhostel.users.entity.Hostellers;

@RepositoryRestResource()
public interface HostellersRepository extends JpaRepository<Hostellers, Integer>, JpaSpecificationExecutor<Hostellers>, QuerydslPredicateExecutor<Hostellers> {}
