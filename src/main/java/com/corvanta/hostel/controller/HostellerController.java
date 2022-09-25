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

import com.corvanta.hostel.entity.Hosteller;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.HostellerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class HostellerController {

	@Autowired
	HostellerService hostellersService;

	@GetMapping(path = HostellerLinks.LIST_HOSTELLERS)
	public ResponseEntity<?> listhostellers() {
		log.info("HostellersController:  list hostellers");
		List<Hosteller> resource = hostellersService.getHostellers();
		return ResponseEntity.ok(resource);
	}

	@PostMapping(path = HostellerLinks.ADD_HOSTELLER)
	public ResponseEntity<?> saveHosteller(@RequestBody Hosteller Hosteller) {
		log.info("HostellersController:  list hostellers");
		Hosteller resource = hostellersService.saveHosteller(Hosteller);
		return ResponseEntity.ok(resource);
	}

	@GetMapping(path = HostellerLinks.GET_HOSTELLER)
	public ResponseEntity<?> getHosteller(@PathVariable("id") int hostellerId) {
		log.info("HostellerController:  getHosteller :: " + hostellerId);
		Hosteller resource = hostellersService.getHosteller(hostellerId);
		return ResponseEntity.ok(resource);
	}

	@PutMapping(path = HostellerLinks.UPDATE_HOSTELLER)
	public ResponseEntity<?> updateHosteller(@PathVariable int hostellerId, @RequestBody Hosteller HostellerDetails) {
		log.info("HostellersController: updateHosteller :: " + hostellerId);
		Hosteller resource = hostellersService.updateHosteller(hostellerId);
		return ResponseEntity.ok(resource);
	}
}
