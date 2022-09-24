package com.corvanta.hostel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corvanta.hostel.entity.Hostellers;
import com.corvanta.hostel.links.HostellerLinks;
import com.corvanta.hostel.service.HostellersService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/")
public class HostellersController {
	
	@Autowired
	HostellersService hosterllersService;
	
	@GetMapping(path = HostellerLinks.LIST_HOSTELLERS)
    public ResponseEntity<?> listhostellers() {
        log.info("HostellersController:  list hostellers");
        List<Hostellers> resource = hosterllersService.getHostellers();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = HostellerLinks.ADD_HOSTELLER)
	public ResponseEntity<?> saveHosteller(@RequestBody Hostellers Hosteller) {
        log.info("HostellersController:  list hostellers");
        Hostellers resource = hosterllersService.saveHosteller(Hosteller);
        return ResponseEntity.ok(resource);
    }
}

 