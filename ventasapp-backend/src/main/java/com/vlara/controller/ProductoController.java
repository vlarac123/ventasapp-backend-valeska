package com.vlara.controller;


import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vlara.exception.ModeloNotFoundException;
import com.vlara.model.Producto;
import com.vlara.service.IProductoService;

@RestController
@RequestMapping("/productos")
//@CrossOrigin()
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping
	public ResponseEntity<List<Producto>> listar() {
		List<Producto> lista = service.listar();
		return new ResponseEntity<List<Producto>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Producto> listarPorId(@PathVariable("id") Integer id) {
		Producto pro = service.leerPorId(id);
		if (pro.getIdProducto() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		return new ResponseEntity<Producto>(pro, HttpStatus.OK);
	}
	
	//nivel 1
	@GetMapping("/pageable")
	public ResponseEntity<Page<Producto>> listarPageable(Pageable pageable) {
		Page<Producto> productos = service.listarPageable(pageable);
		return new ResponseEntity<Page<Producto>>(productos, HttpStatus.OK);
	}
	
	// nivel 2
	@PostMapping
	public ResponseEntity<Object> registrar(@Valid @RequestBody Producto proiente) {
		Producto pro = service.registrar(proiente);
		//productos/4
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(proiente.getIdProducto()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	public ResponseEntity<Producto> modificar(@Valid @RequestBody Producto proiente) {
		Producto pro = service.modificar(proiente);
		return new ResponseEntity<Producto>(pro, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> eliminar(@PathVariable("id") Integer id) {
		Producto pro = service.leerPorId(id);
		if (pro.getIdProducto() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO" + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
}
