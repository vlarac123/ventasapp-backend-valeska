package com.vlara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "marca")
public class Marca {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	
	@Column(name = "descripcion", length = 50) 
	private String descripcion;
	
	@Column(name = "direccion", length = 50)
	private String direccion;
	
	@Column(name = "cuidad", length = 50)
	private String cuidad;

	public Integer getIdMarca() {
		return idMarca;
	}

	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}
	
	
	
	
}
