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
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_supervisor;
	
	
	@Size(min = 5, message = "La descripcion debe tener minimo 5 caracteres")
	@Column(name = "descripcion", nullable = false, length = 100)
	private String descripcion;
	
	@PositiveOrZero(message = "El valor del producto debe ser mayor o igual a cero")
	@Column(name = "valor_producto", nullable = false)
	private Integer valor_producto;

	@ManyToOne
	@JoinColumn(name = "id_marca", nullable = false, foreignKey = @ForeignKey(name = "FK_producto_marca"))
	private Marca marca;

	public Integer getId_supervisor() {
		return id_supervisor;
	}

	public void setId_supervisor(Integer id_supervisor) {
		this.id_supervisor = id_supervisor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getValor_producto() {
		return valor_producto;
	}

	public void setValor_producto(Integer valor_producto) {
		this.valor_producto = valor_producto;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
