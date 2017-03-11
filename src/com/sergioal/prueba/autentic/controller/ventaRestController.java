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
	
	@RequestMapping(value="/addResponse", method=RequestMethod.POST)
	public List<ventaBean> listResponse(Model model, @RequestParam("idProducto") int idProducto, @RequestParam("cantProducto") int cantProducto, @RequestParam("id_preventa") int idPreventa){
		productoBean productoVen = validarProducto(idProducto);
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
		
		productoBean producto = productoSer.findById(id);
		return producto;
		
	}

}
