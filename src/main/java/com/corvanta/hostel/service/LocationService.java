package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Location;
import com.corvanta.hostel.repository.LocationRepository;

@Component
public class LocationService {

	private LocationRepository locationRepository;

	public LocationService(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}
	
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	public Location getLocation(int locationId) {
		return locationRepository.findById(locationId).get();
	}

	public Location updateLocation(int locationId, Location location) {
		location.setId(locationId);
		return locationRepository.save(location);
	}
}

