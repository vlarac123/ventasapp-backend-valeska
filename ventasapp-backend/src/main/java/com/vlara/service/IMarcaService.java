package com.vlara.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Marca;

public interface IMarcaService extends ICRUD<Marca>{

	Page<Marca> listarPageable(Pageable pageable);
}
