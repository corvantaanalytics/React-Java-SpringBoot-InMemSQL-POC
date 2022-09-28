package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.UserProfile;
import com.corvanta.hostel.repository.UserProfileRepository;

@Component
public class UserProfileService {

	private UserProfileRepository userProfileRepository;

	public UserProfileService(UserProfileRepository userProfileRepository) {
		this.userProfileRepository = userProfileRepository;
	}

	public List<UserProfile> getAllUserProfile() {
		return userProfileRepository.findAll();
	}

	public UserProfile saveUserProfile(UserProfile userProfile) {
		return userProfileRepository.save(userProfile);
	}

	public UserProfile getUserProfile(int roomId) {
		return userProfileRepository.findById(roomId).get();
	}

	public UserProfile updateUserProfile(int roomId, UserProfile userProfile) {
		return userProfileRepository.save(userProfile);
	}
}
