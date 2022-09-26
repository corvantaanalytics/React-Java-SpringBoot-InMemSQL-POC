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

import com.corvanta.hostel.entity.Feedback;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.FeedbackService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class FeedbackController {

	@Autowired
	FeedbackService feedbackService;

	@GetMapping(path = HostellerLinks.LIST_FEEDBACKS)
	public ResponseEntity<?> listfeedbacks() {
		log.info("FeedbackController:  list Feedbacks");
		List<Feedback> resource = feedbackService.getAllFeedbacks();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_FEEDBACK)
	public ResponseEntity<?> saveFeedback(@RequestBody Feedback feedback) {
		log.info("FeedbackController:  saveFeedback");
		Feedback resource = feedbackService.saveFeedback(feedback);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_FEEDBACK)
	public ResponseEntity<?> getFeedback(@PathVariable("id") int roomId) {
		log.info("FeedbackController:  getFeedback :: " + roomId);
		Feedback resource = feedbackService.getFeedback(roomId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_FEEDBACK)
	public ResponseEntity<?> updateFeedback(@PathVariable("id") int roomId, @RequestBody Feedback feedback) {
		log.info("FeedbackController: updateFeedback:: " + roomId);
		Feedback resource = feedbackService.updateFeedback(roomId, feedback);
		return ResponseEntity.ok(resource);
	}

}
