package com.Buses.service;

import org.springframework.data.domain.Pageable;


import org.springframework.data.domain.Page;

import com.Buses.model.Bus;


public interface BusService {
    Page<Bus> getAllBuses(Pageable pageable);
    Bus getBusById(Long  id);
}
