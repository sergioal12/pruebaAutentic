package com.sergioal.prueba.autentic.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sergioal.prueba.autentic.bean.ventaBean;

@Repository
public class ventaDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<ventaBean> findAll(){
		Session session = sessionFactory.getCurrentSession();
		List venta = session.createQuery("from ventaBean").list();
		
		return venta;	
	}
	
	@Transactional
	public List<ventaBean> findById(int id){
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ventaBean where id = :id");
		query.setParameter("id", id);
		List ventaResultado = query.list();
		return ventaResultado;
	}
	
	@Transactional
	public void insertVenta(ventaBean venta){
		sessionFactory.getCurrentSession().save(venta);
	}
	
	@Transactional
	public int insertVentaId(ventaBean venta){
		int ventaId = 0;
		Session session = sessionFactory.getCurrentSession();
		//quiero obtener el id de la venta que acabo de guardar, desde el controller 
		//utilizare este id para lanzar la consulta y que el servicio tenga la respuesta deseada
		try{
			Serializable ser = session.save(venta);
			if(ser != null){
				ventaId = (Integer)ser;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ventaId;
	}

}
