package com.cdiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vendedor")
public class Vendedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_vendedor;
	
	
	@Size(min = 2, message = "El nombre debe tener minimo 2 caracteres")
	@Column(name = "nombre_vendedor", nullable = false, length = 100)
	private String nombre_vendedor;
	
	@Size(min = 5, message = "La direccion debe tener minimo 5 caracteres")
	@Column(name = "dir_vendedor", nullable = false, length = 100)
	private String dir_vendedor;

	@ManyToOne
	@JoinColumn(name = "id_supervisor", nullable = false, foreignKey = @ForeignKey(name = "FK_vendedor_supervisor"))
	private Supervisor supervisor;

	public Integer getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(Integer id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	public String getNombre_vendedor() {
		return nombre_vendedor;
	}

	public void setNombre_vendedor(String nombre_vendedor) {
		this.nombre_vendedor = nombre_vendedor;
	}

	public String getDir_vendedor() {
		return dir_vendedor;
	}

	public void setDir_vendedor(String dir_vendedor) {
		this.dir_vendedor = dir_vendedor;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

}
