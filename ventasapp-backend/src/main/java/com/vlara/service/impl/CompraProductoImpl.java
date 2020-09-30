package com.vlara.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vlara.model.CompraProducto;
import com.vlara.repo.ICompraProductoRepo;
import com.vlara.service.ICompraProductoService;

@Service
public class CompraProductoImpl implements ICompraProductoService {
	
	
	@Autowired
	private ICompraProductoRepo repo;
	
	@Override
	public List<CompraProducto> listarProductosVenta(Integer idVenta) {
		return repo.listarProductosVenta(idVenta);
	}

}
