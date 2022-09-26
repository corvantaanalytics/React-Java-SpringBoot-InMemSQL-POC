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

import com.corvanta.hostel.entity.RoomRequest;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.RoomRequestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class RoomRequestController {

	@Autowired
	RoomRequestService roomRequestService;

	@GetMapping(path = HostellerLinks.LIST_REQUESTS)
	public ResponseEntity<?> listRoomRequests() {
		log.info("RoomRequestController:  list RoomRequests");
		List<RoomRequest> resource = roomRequestService.getAllRoomRequests();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_REQUEST)
	public ResponseEntity<?> saveRoomRequests(@RequestBody RoomRequest roomRequest) {
		log.info("RoomRequestController:  saveRoomRequests");
		RoomRequest resource = roomRequestService.saveRoomRequest(roomRequest);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_REQUEST)
	public ResponseEntity<?> getRoomRequests(@PathVariable("id") int roomId) {
		log.info("RoomRequestController:  getRoomRequests :: " + roomId);
		RoomRequest resource = roomRequestService.getRoomRequest(roomId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_REQUEST)
	public ResponseEntity<?> updateRoomRequests(@PathVariable("id") int roomId, @RequestBody RoomRequest roomRequest) {
		log.info("RoomRequestController: updateRoomRequests:: " + roomId);
		RoomRequest resource = roomRequestService.updateRoomRequest(roomId, roomRequest);
		return ResponseEntity.ok(resource);
	}

}
