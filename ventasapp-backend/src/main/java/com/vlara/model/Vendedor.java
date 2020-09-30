package com.vlara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idVendedor;
		
	@ManyToOne
	@JoinColumn(name = "idSupervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_consulta_supervisor"))
	private Supervisor supervisor;
	
	
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombreVendedor", nullable = false, length = 70)
	private String nombreVendedor;
	
	@Size(min = 3, message = "Dirección debe tener minimo 3 caracteres")
	@Column(name = "dirVendedor", nullable = false, length = 70)
	private String dirVendedor;

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getDirVendedor() {
		return dirVendedor;
	}

	public void setDirVendedor(String dirVendedor) {
		this.dirVendedor = dirVendedor;
	}
	
	
	
}
