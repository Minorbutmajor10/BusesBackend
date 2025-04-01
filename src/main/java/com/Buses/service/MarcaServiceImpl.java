package com.Buses.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.Buses.model.Bus;
import com.Buses.model.Marca;
import com.Buses.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService {

    private final MarcaRepository marcaRepository;

    public MarcaServiceImpl(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    @Override
    public Page<Marca> getAllMarcas(Pageable pageable) {
        return marcaRepository.findAll(pageable); 
    }
}
