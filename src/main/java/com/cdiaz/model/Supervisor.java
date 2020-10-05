package com.cdiaz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "supervisor")
public class Supervisor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_supervisor;
	
	
	@Size(min = 2, message = "El nombre debe tener minimo 2 caracteres")
	@Column(name = "nombre_supervisor", nullable = false, length = 100)
	private String nombre_supervisor;
	
	
	@Size(min = 5, message = "La direccion debe tener minimo 5 caracteres")
	@Column(name = "dir_supervisor", nullable = false, length = 100)
	private String dir_supervisor;
		

	@Size(min = 9, max = 9, message = "El telefono debe tener 9 caracteres")
	@Column(name = "tel_supervisor", nullable = true, length = 9)
	private String tel_supervisor;


	public Integer getId_supervisor() {
		return id_supervisor;
	}


	public void setId_supervisor(Integer id_supervisor) {
		this.id_supervisor = id_supervisor;
	}


	public String getNombre_supervisor() {
		return nombre_supervisor;
	}


	public void setNombre_supervisor(String nombre_supervisor) {
		this.nombre_supervisor = nombre_supervisor;
	}


	public String getDir_supervisor() {
		return dir_supervisor;
	}


	public void setDir_supervisor(String dir_supervisor) {
		this.dir_supervisor = dir_supervisor;
	}


	public String getTel_supervisor() {
		return tel_supervisor;
	}


	public void setTel_supervisor(String tel_supervisor) {
		this.tel_supervisor = tel_supervisor;
	}

}
