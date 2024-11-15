package com.Buses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buses.model.Marca;
import com.Buses.repository.MarcaRepository;


@Service
public class MarcaService {
	
	@Autowired
	private MarcaRepository marcaRepository;
	
	
	public List<Marca> findAll() {
		return marcaRepository.findAll();
	}

}