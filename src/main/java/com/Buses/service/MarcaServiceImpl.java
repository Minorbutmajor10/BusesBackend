package com.Buses.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.Buses.model.Marca;
import com.Buses.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public List<Marca> getAllMarcas() {
        return marcaRepository.findAll(); 
    }
    
  
}
