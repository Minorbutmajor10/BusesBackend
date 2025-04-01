package com.Buses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buses.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BusRepository extends JpaRepository<Bus, Long >{
    Page<Bus> findAll(Pageable pageable); 

}
