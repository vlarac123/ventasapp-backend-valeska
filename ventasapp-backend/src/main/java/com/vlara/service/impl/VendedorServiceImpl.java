package com.vlara.service.impl;

import org.springframework.stereotype.Service;

import com.vlara.model.Vendedor;
import com.vlara.repo.IVendedorRepo;
import com.vlara.service.IVendedorService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class VendedorServiceImpl implements IVendedorService {
	@Autowired
	private IVendedorRepo repo;
	
	@Override
	public Vendedor registrar(Vendedor pac) {
		return repo.save(pac);
	}
	
	@Override
	public Vendedor modificar(Vendedor pac) {
		return repo.save(pac);
	}
	
	@Override 
	public List<Vendedor> listar() {
		return repo.findAll();
	}
	
	@Override
	public Page<Vendedor> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	@Override
	public Vendedor leerPorId(Integer id) {
		Optional<Vendedor> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Vendedor(); 
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
