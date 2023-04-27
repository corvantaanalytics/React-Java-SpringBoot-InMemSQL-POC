package com.corvanta.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corvanta.hostel.entity.ServiceApartments;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.ServiceApartmentsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class ServiceApartmentsController {

	@Autowired
	ServiceApartmentsService serviceApartmentsService;

	@GetMapping(path = HostellerLinks.LIST_SERVICEAPARTMENTS)
	public ResponseEntity<?> getServiceApartments() {
		log.info("ServiceApartmentsController:  getServiceApartments");
		List<ServiceApartments> resource = serviceApartmentsService.getServiceApartments();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_SERVICEAPARTMENT)
	public ResponseEntity<?> saveServiceApartment(@RequestBody ServiceApartments serviceApartments) {
		log.info("ServiceApartmentsController:  saveServiceApartment");
		ServiceApartments resource = serviceApartmentsService.saveServiceApartment(serviceApartments);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_SERVICEAPARTMENTS)
	public ResponseEntity<?> getServieApartments(@PathVariable("locationId") int location_Id) {
		log.info("ServiceApartmentsController:  getServiceApartments :: " + location_Id);
		ServiceApartments resource = serviceApartmentsService.getServiceApartments(location_Id);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_SERVICEAPARTMENTS)
	public ResponseEntity<?> updateServieApartment(@PathVariable("id") int location_Id, @RequestBody ServiceApartments serviceApartments) {
		log.info("ServiceApartmentsController: updateServiceApartment:: " + location_Id);
		ServiceApartments resource = serviceApartmentsService.updateServiceApartment(location_Id, serviceApartments);
		return ResponseEntity.ok(resource);
	}

}

