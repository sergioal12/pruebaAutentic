package com.sergioal.prueba.autentic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sergioal.prueba.autentic.bean.productoBean;
import com.sergioal.prueba.autentic.service.productoService;


@RestController
@RequestMapping("/producto")
public class productoRestController {
	
	@Autowired
	private productoService productoSer;
	
	@RequestMapping(value="/{idProducto}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String producto(@PathVariable String idProducto){
		String productoRes = "comida para gato "+idProducto;
		return productoRes;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<productoBean> list(Model model){
		
		List<productoBean> producto = productoSer.findAll();
		System.out.println("estamos en el controller " + model + " esto es producto "+ producto+" ________ ");
		model.addAttribute("producto",new productoBean());
		model.addAttribute("producto", this.productoSer.findAll());
		return producto;
	}
}
