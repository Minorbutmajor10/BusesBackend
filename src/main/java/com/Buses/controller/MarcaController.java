package com.Buses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Buses.model.Marca;
import com.Buses.service.MarcaService;


@RestController
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
    MarcaService marcaService;

   
    @GetMapping
    public ResponseEntity<List<Marca>> getAllMarcas() {
        return ResponseEntity.ok(marcaService.getAllMarcas()); 
    }
}
