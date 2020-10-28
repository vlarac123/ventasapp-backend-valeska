package com.vlara.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Vendedor;

public interface IVendedorService extends ICRUD<Vendedor> {

	Page<Vendedor> listarPageable(Pageable pageable);
}
