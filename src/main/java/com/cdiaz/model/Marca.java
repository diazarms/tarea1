package com.cdiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_marca;
	
	
	@Size(min = 2, message = "La descripcion debe tener minimo 2 caracteres")
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;
	
	
	@Size(min = 5, message = "La direccion debe tener minimo 5 caracteres")
	@Column(name = "direccion", nullable = false, length = 100)
	private String direccion;
	
	@Size(min = 4, message = "La ciudad debe tener al menos 4 caracteres")
	@Column(name = "ciudad", nullable = false, length = 100)
	private String ciudad;

	public Integer getId_marca() {
		return id_marca;
	}

	public void setId_marca(Integer id_marca) {
		this.id_marca = id_marca;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

}
