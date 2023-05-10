package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Hosteller;
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

	public List<ServiceApartments> getServiceApartmentsByLocationId(int location_Id) {
		return serviceApartmentsRepository.findByLocationId(location_Id);
	}
	
	public ServiceApartments getServiceApartmentsById(int id) {
		return serviceApartmentsRepository.findById(id).get();
	}

	public ServiceApartments updateServiceApartment(int id, ServiceApartments serviceApartments) {
		serviceApartments.setId(id);
		return serviceApartmentsRepository.save(serviceApartments);
	}
	
	public ServiceApartments deleteServiceApartment(int id) {
		return serviceApartmentsRepository.deleteById(id);
	}	
}


