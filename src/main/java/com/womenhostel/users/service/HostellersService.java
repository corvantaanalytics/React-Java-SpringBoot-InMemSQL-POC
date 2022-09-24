package com.womenhostel.users.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.womenhostel.users.entity.Hostellers;
import com.womenhostel.users.repository.HostellersRepository;

@Component
public class HostellersService {
	
	private HostellersRepository hostellersRepository;

    public HostellersService(HostellersRepository hostellersRepository) {
        this.hostellersRepository = hostellersRepository;
    }

    public List<Hostellers> getHostellers() {
        return hostellersRepository.findAll();
    }
    
    public Hostellers saveHosteller(Hostellers hostellers) {
    	return hostellersRepository.save(hostellers);
    }

}

