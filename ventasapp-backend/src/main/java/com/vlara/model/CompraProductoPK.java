package com.vlara.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@Embeddable
public class CompraProductoPK implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "id_producto", nullable = false)
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name = "id_venta", nullable = false)
	private Venta venta;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((venta == null) ? 0 : venta.hashCode());
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
		CompraProductoPK other = (CompraProductoPK) obj;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (venta == null) {
			if (other.venta != null)
				return false;
		} else if (!venta.equals(other.venta))
			return false;
		return true;
	}

	
}
