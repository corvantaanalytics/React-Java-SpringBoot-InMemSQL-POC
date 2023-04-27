package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.ServiceApartments;
import com.corvanta.hostel.repository.ServiceApartmentsRepository;

@Component
public class ServiceApartmentsService {

	private ServiceApartmentsRepository serviceApartmentsRepository;

	public ServiceApartmentsService(ServiceApartmentsRepository serviceApartmentsRepository) {
		this.serviceApartmentsRepository = serviceApartmentsRepository;
	}
	
	public List<ServiceApartments> getServiceApartments() {
		return serviceApartmentsRepository.findAll();
	}

	public ServiceApartments saveServiceApartment(	ServiceApartments serviceApartments) {
		return serviceApartmentsRepository.save(serviceApartments);
	}

	public ServiceApartments getServiceApartments(int location_Id) {
		return serviceApartmentsRepository.findById(location_Id).get();
	}

	public ServiceApartments updateServiceApartment(int location_Id, ServiceApartments serviceApartments) {
		return serviceApartmentsRepository.save(serviceApartments);
	}
	
}


