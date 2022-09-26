package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.ServiceRequest;
import com.corvanta.hostel.repository.ServiceRequestRepository;

@Component
public class ServiceRequestService {

	private ServiceRequestRepository serviceRequestRepository;

	public ServiceRequestService(ServiceRequestRepository serviceRequestRepository) {
		this.serviceRequestRepository = serviceRequestRepository;
	}

	public List<ServiceRequest> getAllServiceRequests() {
		return serviceRequestRepository.findAll();
	}

	public ServiceRequest saveServiceRequest(ServiceRequest serviceRequest) {
		return serviceRequestRepository.save(serviceRequest);
	}

	public ServiceRequest getServiceRequest(int roomId) {
		return serviceRequestRepository.findById(roomId).get();
	}

	public ServiceRequest updateServiceRequest(int roomId, ServiceRequest serviceRequest) {
		return serviceRequestRepository.save(serviceRequest);
	}
}
