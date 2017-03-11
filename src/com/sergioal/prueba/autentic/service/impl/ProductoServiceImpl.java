package com.sergioal.prueba.autentic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergioal.prueba.autentic.bean.productoBean;
import com.sergioal.prueba.autentic.service.productoService;
import com.sergioal.prueba.autentic.dao.productoDAO;

@Component
public class ProductoServiceImpl implements productoService{

	@Autowired
	private productoDAO dao;
	
	@Override
	public List<productoBean> findAll() {
		// TODO Auto-generated method stub
		System.out.println("esta dentro de serviceImple");
		return dao.findAll();
	}

	@Override
	public void insertProducto(productoBean producto) {
		// TODO Auto-generated method stub
		dao.insertProducto(producto);
	}

	@Override
	public void deleteProducto(productoBean producto) {
		// TODO Auto-generated method stub
		dao.deleteProducto(producto);
	}

	@Override
	public productoBean productoFindById(int id) {
		// TODO Auto-generated method stub
		System.out.println("aqui estamos dentro de productoServiceImpl");
		return dao.productoFindById(id);
	}

}
