package com.sergioal.prueba.autentic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergioal.prueba.autentic.bean.ventaBean;
import com.sergioal.prueba.autentic.dao.ventaDAO;
import com.sergioal.prueba.autentic.service.ventaService;

@Component
public class VentaServiceImpl implements ventaService {

	@Autowired
	private ventaDAO ventaDAO;
	
	@Override
	public List<ventaBean> findAll() {
		// TODO Auto-generated method stub
		return ventaDAO.findAll();
	}

	@Override
	public void insertVenta(ventaBean venta) {
		// TODO Auto-generated method stub
		ventaDAO.insertVenta(venta);
	}

	@Override
	public int insertVentaId(ventaBean venta) {
		// TODO Auto-generated method stub
		return ventaDAO.insertVentaId(venta);
	}

	@Override
	public List<ventaBean> findById(int id) {
		// TODO Auto-generated method stub
		return ventaDAO.findById(id);
	}

}
