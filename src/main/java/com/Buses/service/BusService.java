package com.Buses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buses.model.Bus;
import com.Buses.repository.BusRepository;


@Service
public class BusService {

	@Autowired
	private BusRepository busRepository;
	
	
	public List<Bus> findAll() {
		return busRepository.findAll();
	}
	
	public Bus findOne(Integer id) {
		return busRepository.findById(id).orElse(null);
	}
}
