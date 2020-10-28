package com.vlara.service.impl;

import org.springframework.stereotype.Service;

import com.vlara.service.IMarcaService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.vlara.model.Marca;
import com.vlara.repo.IMarcaRepo;


@Service
public class MarcaServiceImpl  implements IMarcaService{

	@Autowired
	private IMarcaRepo repo;
	
	@Override
	public Marca registrar(Marca pac) {
		return repo.save(pac);
	}
	
	@Override
	public Marca modificar(Marca pac) {
		return repo.save(pac);
	}
	
	@Override 
	public List<Marca> listar() {
		return repo.findAll();
	}
	
	@Override
	public Page<Marca> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	@Override
	public Marca leerPorId(Integer id) {
		Optional<Marca> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Marca(); 
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
}
