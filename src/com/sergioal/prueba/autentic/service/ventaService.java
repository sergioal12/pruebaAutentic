package com.sergioal.prueba.autentic.service;

import java.util.List;

import com.sergioal.prueba.autentic.bean.ventaBean;

public interface ventaService {
	
	public List<ventaBean> findAll();
	
	public void insertVenta(ventaBean venta);
	
	public int insertVentaId(ventaBean venta);
	
	public List<ventaBean> findById(int id);
	

}
