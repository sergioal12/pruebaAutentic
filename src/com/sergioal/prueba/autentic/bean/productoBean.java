package com.sergioal.prueba.autentic.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "productos")

public class productoBean {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="nom_producto")
	private String nomProducto;
	@Column(name="cant_producto")
	private int cantProducto;
	@Column(name="ubicacion_producto")
	private String ubicacionProducto;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomProducto() {
		return nomProducto;
	}
	public void setNomProducto(String nomProducto) {
		this.nomProducto = nomProducto;
	}
	public int getCantProducto() {
		return cantProducto;
	}
	public void setCantProducto(int cantProducto) {
		this.cantProducto = cantProducto;
	}
	public String getUbicacionProducto() {
		return ubicacionProducto;
	}
	public void setUbicacionProducto(String ubicacionProducto) {
		this.ubicacionProducto = ubicacionProducto;
	}
	
	/*public productoBean(int id, String nomproducto, int cantProducto, String ubicacionProducto ){
		super();
		this.id = id;
		this.nomProducto = nomproducto;
		this.cantProducto = cantProducto;
		this.ubicacionProducto = ubicacionProducto;
	}*/

	
	
	

}
