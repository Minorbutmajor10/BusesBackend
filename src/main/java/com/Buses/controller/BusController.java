package com.Buses.controller;


import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Buses.model.Bus;
import com.Buses.service.BusService;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

@RestController
@RequestMapping("/bus")
public class BusController {
	
	@Autowired
     BusService busService; 
    
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @GetMapping
    public ResponseEntity<Page<Bus>> getAllBuses(
        @RequestParam(defaultValue = "0") int page,
        @RequestParam(defaultValue = "10") int size) {
        
        Pageable pageable = PageRequest.of(page, size);
        return ResponseEntity.ok(busService.getAllBuses(pageable)); 
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long id) {
        return ResponseEntity.ok(busService.getBusById(id));
    }
}
