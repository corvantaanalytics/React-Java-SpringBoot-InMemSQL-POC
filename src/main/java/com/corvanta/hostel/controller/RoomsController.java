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

import com.corvanta.hostel.entity.Rooms;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.RoomsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")                                                                                    
public class RoomsController {

	@Autowired
	RoomsService roomsService;

	@GetMapping(path = HostellerLinks.LIST_ROOMS)
	public ResponseEntity<?> getRooms() {
		log.info("RoomsController:  getRooms");
		List<Rooms> resource = roomsService.getRooms();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_ROOM)
	public ResponseEntity<?> saveRoom(@RequestBody Rooms rooms) {
		log.info("RoomsController:  saveRoom");
		Rooms resource = roomsService.saveRoom(rooms);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_ROOM)
	public ResponseEntity<?> getRoom(@PathVariable("locationId") int locationId, @PathVariable("serviceApartmentId") int serviceApartmentId ) {
		log.info("RoomsController:  getRoom :: " + locationId,serviceApartmentId);
		List<Rooms> resource = roomsService.getRoom(locationId,serviceApartmentId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_ROOM)
	public ResponseEntity<?> updateRoom(@PathVariable("id") int id, @RequestBody Rooms rooms) {
		log.info("RoomsController: updateRoom:: " + id);
		Rooms resource = roomsService.updateRoom(id, rooms);
		return ResponseEntity.ok(resource);
	}

}

