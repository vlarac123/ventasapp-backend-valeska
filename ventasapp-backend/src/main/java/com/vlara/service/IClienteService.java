package com.vlara.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Cliente;

public interface IClienteService extends ICRUD<Cliente>{

	Page<Cliente> listarPageable(Pageable pageable);
}
