package com.Buses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Buses.model.Marca;
import com.Buses.service.MarcaService;


@RestController
@RequestMapping("/marca")
public class MarcaController {

	
	@Autowired
	private MarcaService marcaService;
	
	
	@GetMapping("")
	public List<Marca> findAll(){
		return marcaService.findAll();
	}
}
