package com.sergioal.prueba.autentic.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sergioal.prueba.autentic.bean.productoBean;

@Repository
public class productoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<productoBean> findAll(){
		Session session = sessionFactory.getCurrentSession();
		//String query = "SELECT P.id, P.nomProducto, P.cantProducto, P.ubicacionProducto FROM productoBean P";
		System.out.println("esto es sesion, si se trae bien la conexion, va a tocar hacer una chambonada "+ session);
		List productos = session.createQuery("from productoBean").list();
		//List productos = session.createQuery(query).list();
		//System.out.println("esto es query "+query);
		System.out.println("esta dentro de dao "+productos);
		return productos;
	}
	@Transactional
	public void insertProducto(productoBean producto){
		sessionFactory.getCurrentSession().save(producto);
	}
	@Transactional
	public void deleteProducto(productoBean producto){
		sessionFactory.getCurrentSession().delete(producto);
	}
	
	@Transactional
	public productoBean findById(int id){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from productoBean where id = :id");
		query.setParameter("id",id);
		productoBean producto = (productoBean) query.list();
		return producto;
	}

}
