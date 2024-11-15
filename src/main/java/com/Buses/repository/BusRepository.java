package com.Buses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Buses.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Integer>{

}
