package com.vlara.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Venta;

public interface IVentaService extends ICRUD<Venta> {

	Page<Venta> listarPageable(Pageable pageable);
}
