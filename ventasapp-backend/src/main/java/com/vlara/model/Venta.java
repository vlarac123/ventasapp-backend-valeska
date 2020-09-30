package com.vlara.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVenta;
	
	@ManyToOne
	@JoinColumn(name = "idVendedor", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_vendedor"))
	private Vendedor idVendedor;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_cliente"))
	private Cliente idCliente;
	
	@Column(name = "costo", nullable = false,  scale = 2)
	private double costo;
	
	@Column(name = "fechaVenta", nullable = false)
	private LocalDateTime fechaVenta;

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Vendedor getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Vendedor idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idVenta == null) ? 0 : idVenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Venta other = (Venta) obj;
		if (idVenta == null) {
			if (other.idVenta != null)
				return false;
		} else if (!idVenta.equals(other.idVenta))
			return false;
		return true;
	}
	
	
	
	 

}
