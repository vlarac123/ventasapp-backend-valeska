package com.vlara.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Supervisor;

public interface ISupervisorService extends ICRUD<Supervisor>{

	Page<Supervisor> listarPageable(Pageable pageable);
}
