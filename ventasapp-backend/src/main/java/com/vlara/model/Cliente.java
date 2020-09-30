package com.vlara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombreCliente", length = 50) 
	private String nombreCliente;
	
	@Column(name = "dirCliente", length = 50)
	private String dirCliente;
	
	@Size(min = 9, max = 9, message = "Telefono debe tener 9 caracteres")
	@Column(name = "telCliente", nullable = true, length = 9)
	private String telCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getTelCliente() {
		return telCliente;
	}

	public void setTelCliente(String telCliente) {
		this.telCliente = telCliente;
	}
	
	
	
	
	
	
}
