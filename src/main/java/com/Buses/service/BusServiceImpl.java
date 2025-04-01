package com.Buses.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Buses.model.Bus;
import com.Buses.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

    private final BusRepository busRepository;

    public BusServiceImpl(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public Page<Bus> getAllBuses(Pageable pageable) {
        return busRepository.findAll(pageable); 
    }

    @Override
    public Bus getBusById(Long id) {
        return busRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Bus no encontrado"
            ));
    }
}
