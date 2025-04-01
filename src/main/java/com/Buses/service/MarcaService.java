package com.Buses.service;
import com.Buses.model.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface MarcaService {
	Page<Marca> getAllMarcas(Pageable pageable);
}
