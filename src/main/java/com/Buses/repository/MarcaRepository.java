package com.Buses.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Buses.model.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long >{
    Page<Marca> findAll(Pageable pageable); 

}
