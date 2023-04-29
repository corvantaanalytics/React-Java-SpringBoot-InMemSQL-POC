package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.RoomDetail;
import com.corvanta.hostel.repository.RoomDetailRepository;

@Component
public class RoomDetailsService {

	private RoomDetailRepository roomDetailsRepository;

	public RoomDetailsService(RoomDetailRepository roomDetailsRepository) {
		this.roomDetailsRepository = roomDetailsRepository;
	}

	public List<RoomDetail> getAllRoomDetails() {
		return roomDetailsRepository.findAll();
	}

	public RoomDetail saveRoomDetails(RoomDetail roomDetail) {
		return roomDetailsRepository.save(roomDetail);
	}

	public RoomDetail getRoomDetails(int roomId) {
		return roomDetailsRepository.findById(roomId).get();
	}

	public RoomDetail updateRoomDetails(int roomId, RoomDetail roomDetail) {
		roomDetail.setId(roomId);
		return roomDetailsRepository.save(roomDetail);
	}
}
