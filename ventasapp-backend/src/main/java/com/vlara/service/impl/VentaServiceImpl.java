package com.vlara.service.impl;

import org.springframework.stereotype.Service;

import com.vlara.model.Venta;
import com.vlara.repo.IVentaRepo;
import com.vlara.service.IVentaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Service
public class VentaServiceImpl implements IVentaService {
	@Autowired
	private IVentaRepo repo;
	
	@Override
	public Venta registrar(Venta pac) {
		return repo.save(pac);
	}
	
	@Override
	public Venta modificar(Venta pac) {
		return repo.save(pac);
	}
	
	@Override 
	public List<Venta> listar() {
		return repo.findAll();
	}
	
	@Override
	public Page<Venta> listarPageable(Pageable pageable) {
		return repo.findAll(pageable);
	}
	
	@Override
	public Venta leerPorId(Integer id) {
		Optional<Venta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Venta(); 
	}
	
	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
