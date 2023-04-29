package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Rooms;
import com.corvanta.hostel.repository.RoomsRepository;

@Component
public class RoomsService {

	private RoomsRepository roomsRepository;

	public RoomsService(RoomsRepository roomsRepository) {
		this.roomsRepository = roomsRepository;
	}
	
	public List<Rooms> getRooms() {
		return roomsRepository.findAll();
	}

	public Rooms saveRoom(Rooms rooms) {
		return roomsRepository.save(rooms);
	}

	public List<Rooms> getRoom(int locationId,int serviceApartmentId) {
		return roomsRepository.findByLocationIdAndServiceApartmentId(locationId,serviceApartmentId);
	}

	public Rooms updateRoom(int id, Rooms rooms) {
		rooms.setId(id);
		return roomsRepository.save(rooms);
	}
	
}


