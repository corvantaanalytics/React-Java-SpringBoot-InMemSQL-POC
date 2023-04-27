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

import com.corvanta.hostel.entity.ServiceRequest;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.ServiceRequestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class ServiceRequestController {

	@Autowired
	ServiceRequestService serviceRequestController;

	@GetMapping(path = HostellerLinks.LIST_REQUESTS)
	public ResponseEntity<?> listServiceRequests() {
		log.info("ServiceRequestController:  list ServiceRequests");
		List<ServiceRequest> resource = serviceRequestController.getAllServiceRequests();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_REQUEST)
	public ResponseEntity<?> saveServiceRequests(@RequestBody ServiceRequest serviceRequest) {
		log.info("ServiceRequestController:  saveServiceRequests");
		ServiceRequest resource = serviceRequestController.saveServiceRequest(serviceRequest);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_REQUEST)
	public ResponseEntity<?> getServiceRequests(@PathVariable("id") int roomId) {
		log.info("ServiceRequestController:  getServiceRequests :: " + roomId);
		ServiceRequest resource = serviceRequestController.getServiceRequest(roomId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_REQUEST)
	public ResponseEntity<?> updateServiceRequests(@PathVariable("id") int roomId, @RequestBody ServiceRequest serviceRequest) {
		log.info("ServiceRequestController: updateServiceRequests:: " + roomId);
		ServiceRequest resource = serviceRequestController.updateServiceRequest(roomId, serviceRequest);
		return ResponseEntity.ok(resource);
	}

}
