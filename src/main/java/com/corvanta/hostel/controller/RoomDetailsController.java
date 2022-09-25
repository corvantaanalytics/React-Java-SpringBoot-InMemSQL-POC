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

import com.corvanta.hostel.entity.RoomDetail;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.RoomDetailsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class RoomDetailsController {

	@Autowired
	RoomDetailsService roomDetailsService;

	@GetMapping(path = HostellerLinks.LIST_ROOMDETAILS)
	public ResponseEntity<?> listRoomDetails() {
		log.info("RoomDetailsController:  list roomdetails");
		List<RoomDetail> resource = roomDetailsService.getAllRoomDetails();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_ROOMDETAILS)
	public ResponseEntity<?> saveRoomDetails(@RequestBody RoomDetail roomDetail) {
		log.info("RoomDetailsController:  saveRoomDetails");
		RoomDetail resource = roomDetailsService.saveRoomDetails(roomDetail);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_ROOMDETAILS)
	public ResponseEntity<?> getRoomDetails(@PathVariable("id") int roomId) {
		log.info("RoomDetailsController:  getRoomDetails :: " + roomId);
		RoomDetail resource = roomDetailsService.getRoomDetails(roomId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_ROOMDETAILS)
	public ResponseEntity<?> updateRoomDetails(@PathVariable("id") int roomId, @RequestBody RoomDetail roomDetail) {
		log.info("RoomDetailsController: updateRoomDetails :: " + roomId);
		RoomDetail resource = roomDetailsService.updateRoomDetails(roomId, roomDetail);
		return ResponseEntity.ok(resource);
	}

}
