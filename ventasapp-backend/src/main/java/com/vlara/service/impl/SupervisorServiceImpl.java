package com.vlara.service.impl;

import org.springframework.stereotype.Service;

import com.vlara.model.Supervisor;
import com.vlara.repo.ISupervisorRepo;
import com.vlara.service.ISupervisorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class SupervisorServiceImpl implements ISupervisorService {
	
	@Autowired
	private ISupervisorRepo repo;
	
	@Override
	public Supervisor registrar(Supervisor pac) {
		return repo.save(pac);
	}
	
	@Override
	public Supervisor modificar(Supervisor pac) {
		return repo.save(pac);
	}
	
	@Override 
	public List<Supervisor> listar() {
		return repo.findAll();
	}
	
	@Override
	public Page<Supervisor> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	@Override
	public Supervisor leerPorId(Integer id) {
		Optional<Supervisor> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Supervisor(); 
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
