package com.corvanta.hostel.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.corvanta.hostel.entity.Feedback;
import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.repository.FeedbackRepository;

@Component
public class FeedbackService {

	private FeedbackRepository feedbackRepository;

	public FeedbackService(FeedbackRepository feedbackRepository) {
		this.feedbackRepository = feedbackRepository;
	}

	public List<Feedback> getAllFeedbacks() {
		return feedbackRepository.findAll();
	}

	public Feedback saveFeedback(Feedback feedback) {
		return feedbackRepository.save(feedback);
	}

	public Feedback getFeedback(int roomId) {
		return feedbackRepository.findById(roomId).get();
	}

	public Feedback updateFeedback(int roomId, Feedback feedback) {
		feedback.setId(roomId);
		return feedbackRepository.save(feedback);
	}
	
	public Feedback deleteFeedback(int id) {
		return feedbackRepository.deleteById(id);
	}
}
