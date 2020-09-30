package com.vlara.service;

import java.util.List;

import com.vlara.model.CompraProducto;

public interface ICompraProductoService {
	
	List<CompraProducto> listarProductosVenta(Integer idVenta);

}
