package com.Buses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Buses.model.Bus;
import com.Buses.service.BusService;


@RestController
@RequestMapping("/bus")
public class BusController {

	@Autowired
	private BusService busService;
	
	
	@GetMapping("")
	public List<Bus> findAll(){
		return busService.findAll();
	}
	
	@GetMapping("/{id}")
    public Bus findOne(@PathVariable Integer id) {
        return busService.findOne(id);
    }
}
