package com.vlara.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vlara.model.CompraProducto;
import com.vlara.service.ICompraProductoService;

@RestController
@RequestMapping("/compraproductos")
public class CompraProductoController {
	
	@Autowired
	private ICompraProductoService service;
	
	@GetMapping(value = "/{idVenta}")
	public ResponseEntity<List<CompraProducto>> listar(@PathVariable("idVenta") Integer idVenta) {
		List<CompraProducto> compraproductos = new ArrayList<>();
		compraproductos = service.listarProductosVenta(idVenta);
		return new ResponseEntity<List<CompraProducto>>(compraproductos, HttpStatus.OK);
	}
}