package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.repository.HostellerRepository;

@Component
public class HostellerService {

	private HostellerRepository hostellerRepository;

	public HostellerService(HostellerRepository hostellerRepository) {
		this.hostellerRepository = hostellerRepository;
	}
	
	public List<Hosteller> getHostellers() {
		return hostellerRepository.findAll();
	}

	public Hosteller saveHosteller(Hosteller hosteller) {
		return hostellerRepository.save(hosteller);
	}

	public Hosteller getHosteller(int hostellerId) {
		return hostellerRepository.findById(hostellerId).get();
	}

	public Hosteller updateHosteller(int hostellerId, Hosteller hosteller) {
		return hostellerRepository.save(hosteller);
	}
}

