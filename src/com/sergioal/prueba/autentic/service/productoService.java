package com.sergioal.prueba.autentic.service;

import java.util.List;



import com.sergioal.prueba.autentic.bean.productoBean;

public interface productoService {
	
	
	public List<productoBean> findAll();
	
	public void insertProducto(productoBean producto);
	
	public void deleteProducto(productoBean producto);
	
	public productoBean productoFindById(int id);

}
