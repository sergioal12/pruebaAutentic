package com.sergioal.prueba.autentic.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ventas")
public class ventaBean {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column(name="venta_efectuada")
	boolean ventaEfectuada;
	@Column(name="fecha_venta")
	Date fechaVenta;
	@Column(name="total_venta")
	int totalVenta;
	@Column(name="despacho_venta")
	String despachoVenta;
	@Column(name="id_producto")
	int idProducto;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isVentaEfectuada() {
		return ventaEfectuada;
	}

	public void setVentaEfectuada(boolean ventaEfectuada) {
		this.ventaEfectuada = ventaEfectuada;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public int getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}

	public String getDespachoVenta() {
		return despachoVenta;
	}

	public void setDespachoVenta(String despachoVenta) {
		this.despachoVenta = despachoVenta;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	
	

}
