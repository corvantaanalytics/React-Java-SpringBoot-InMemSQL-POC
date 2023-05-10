package com.corvanta.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.entity.Location;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.LocationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class LocationController {

	@Autowired
	LocationService locationService;

	@GetMapping(path = HostellerLinks.LIST_LOCATIONS)
	public ResponseEntity<?> getLocations() {
		log.info("LocationController:  get Locations");
		List<Location> resource = locationService.getLocations();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_LOCATION)
	public ResponseEntity<?> saveLocation(@RequestBody Location location) {
		log.info("LocationController:  saveLocation");
		Location resource = locationService.saveLocation(location);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_LOCATION)
	public ResponseEntity<?> getLocation(@PathVariable("id") int locationId) {
		log.info("LocationController:  getLocation :: " + locationId);
		Location resource = locationService.getLocation(locationId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_LOCATION)
	public ResponseEntity<?> updateLocation(@PathVariable("id") int locationId, @RequestBody Location location) {
		log.info("LocationController: updateLocation:: " + locationId);
		Location resource = locationService.updateLocation(locationId, location);
		return ResponseEntity.ok(resource);
	}
	
	@DeleteMapping(path = HostellerLinks.DELETE_LOCATION)
	public ResponseEntity<?> deleteLocation(@PathVariable("id") int id) {
		log.info("LocationController: deleteLocation :: " + id);
		Location resource = locationService.deleteLocation(id);
		return ResponseEntity.ok(resource);
	}
	
}
