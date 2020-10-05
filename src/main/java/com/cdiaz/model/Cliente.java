package com.cdiaz.model;

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
	private Integer id_supervisor;
	
	
	@Size(min = 2, message = "El nombre debe tener minimo 2 caracteres")
	@Column(name = "nombre_cliente", nullable = false, length = 100)
	private String nombre_cliente;
	
	
	@Size(min = 5, message = "La direccion debe tener minimo 5 caracteres")
	@Column(name = "dir_cliente", nullable = false, length = 100)
	private String dir_cliente;
		

	@Size(min = 9, max = 9, message = "El telefono debe tener 9 caracteres")
	@Column(name = "tel_cliente", nullable = true, length = 9)
	private String tel_cliente;


	public Integer getId_supervisor() {
		return id_supervisor;
	}


	public void setId_supervisor(Integer id_supervisor) {
		this.id_supervisor = id_supervisor;
	}


	public String getNombre_cliente() {
		return nombre_cliente;
	}


	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}


	public String getDir_cliente() {
		return dir_cliente;
	}


	public void setDir_cliente(String dir_cliente) {
		this.dir_cliente = dir_cliente;
	}


	public String getTel_cliente() {
		return tel_cliente;
	}


	public void setTel_cliente(String tel_cliente) {
		this.tel_cliente = tel_cliente;
	}

}
