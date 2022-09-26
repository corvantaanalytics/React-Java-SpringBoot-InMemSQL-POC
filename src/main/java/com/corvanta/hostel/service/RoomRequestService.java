package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.RoomRequest;
import com.corvanta.hostel.repository.RoomRequestRepository;

@Component
public class RoomRequestService {

	private RoomRequestRepository roomRequestRepository;

	public RoomRequestService(RoomRequestRepository roomRequestRepository) {
		this.roomRequestRepository = roomRequestRepository;
	}

	public List<RoomRequest> getAllRoomRequests() {
		return roomRequestRepository.findAll();
	}

	public RoomRequest saveRoomRequest(RoomRequest roomRequest) {
		return roomRequestRepository.save(roomRequest);
	}

	public RoomRequest getRoomRequest(int roomId) {
		return roomRequestRepository.findById(roomId).get();
	}

	public RoomRequest updateRoomRequest(int roomId, RoomRequest roomRequest) {
		return roomRequestRepository.save(roomRequest);
	}
}
