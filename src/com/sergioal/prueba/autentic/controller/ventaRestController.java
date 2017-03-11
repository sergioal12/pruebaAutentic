package com.sergioal.prueba.autentic.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sergioal.prueba.autentic.service.productoService;
import com.sergioal.prueba.autentic.service.ventaService;
import com.sergioal.prueba.autentic.bean.productoBean;
import com.sergioal.prueba.autentic.bean.ventaBean;

@RestController
@RequestMapping("/venta")
public class ventaRestController {
	
	@Autowired
	private ventaService ventaSer;
	private productoService productoSer;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ventaBean> list(Model model){
		List<ventaBean> venta = ventaSer.findAll();
		model.addAttribute("venta", new ventaBean());
		model.addAttribute("venta", this.ventaSer.findAll());
		return venta;
		
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addVenta(@ModelAttribute("venta") ventaBean venta){
		ventaSer.insertVenta(venta);
		return "redirect:/venta";
	}
	
	@RequestMapping(value="/addResponse", method=RequestMethod.GET)
	public List<ventaBean> listResponse(Model model, @RequestParam("idProducto") int idProducto, @RequestParam("cantProducto") int cantProducto, @RequestParam("id_preventa") int idPreventa){
		System.out.println("esto son los valores que se envian a la consulta esto es idProducto: "+ idProducto+" esto es cantProducto: "+ cantProducto+  " esto es id_preventa: "+idPreventa );
		productoBean productoVen = validarProducto(idProducto);
		System.out.println("esto es productoVen "+productoVen.toString());
		ventaBean ventaSal = new ventaBean();
		ventaSal.setIdProducto(productoVen.getId());
		int totalVenta = cantProducto * 2;
		ventaSal.setTotalVenta(totalVenta);
		ventaSal.setDespachoVenta(productoVen.getUbicacionProducto());
		ventaSal.setVentaEfectuada(true);
		Date fechaVenta = new Date();
		ventaSal.setFechaVenta(fechaVenta);
		
		int idVenta = ventaSer.insertVentaId(ventaSal);
		
		
		List<ventaBean> venta = ventaSer.findById(idVenta);//revisar 
		return venta;
	}
	
	private productoBean validarProducto(int id){
		System.out.println("dentro de validar producto, si esta lanzando la peticion? este es el valor de id que llega: "+id);
		productoBean productoVal = new productoBean();
		try{
			productoVal = productoSer.productoFindById(id);
			return productoVal;
		}catch(Exception e){
				System.out.println("le llamaban machete..... es todo lo que tengo que decir sobre esto");
				productoVal.setCantProducto(2);
				productoVal.setId(1);
				productoVal.setNomProducto("comida para gato");
				productoVal.setUbicacionProducto("tienda principal");
				System.out.println("esto es lo que tiene productoVal: "+productoVal);
				e.printStackTrace();
				return productoVal;
		}
		
		//System.out.println("despues de supuestamente ejecutar la consulta que rayos pasa aca? esto es producto: "+productoVal.toString());
		//return productoVal;
		
	}

}
