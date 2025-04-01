package com.Buses.service;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.Buses.model.Bus;
import com.Buses.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {

	@Autowired
    BusRepository busRepository;

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
