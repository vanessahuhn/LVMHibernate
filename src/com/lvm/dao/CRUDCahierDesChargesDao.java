package com.lvm.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lvm.model.CahierDesCharges;

public class CRUDCahierDesChargesDao {
	
	public void createCahierDesCharges(CahierDesCharges cahierDesCharges) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//create
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		session.save(cahierDesCharges);
		tx.commit();

		System.out.println("Le cahier des charges a été ajouté à votre base de données.");
	}
	
	public List<CahierDesCharges> readCahierDesCharges() {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//read
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		
		List<CahierDesCharges> cahierDesChargesListe = Collections.synchronizedList(session.createQuery("FROM CahierDesCharges").list());

		tx.commit();
		
		return cahierDesChargesListe;
		
	}
	
	public void updateCahierDesCharges(CahierDesCharges cahierDesCharges) {
		
	}
	
	public void deleteCahierDesCharges(int idCahierDesCharges) {
		
	}
	
	
	
	

}
