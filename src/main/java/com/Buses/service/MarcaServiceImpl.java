package com.Buses.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Buses.model.Marca;
import com.Buses.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {

	@Autowired
    MarcaRepository marcaRepository;

    @Override
    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll(); 
    }
    
  
}
