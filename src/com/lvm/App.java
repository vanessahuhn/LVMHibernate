package com.lvm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

import com.lvm.model.CahierDesCharges;
 
public class App {
 
	
	public static void main(String[] args) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		//create
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();

		CahierDesCharges cahierDesCharges1 = new CahierDesCharges();
		cahierDesCharges1.setTypeSite("e-commerce");
		cahierDesCharges1.setTailleEntreprise("");
		cahierDesCharges1.setFonctionnalites(null);
		cahierDesCharges1.setTypeLicence("");

		session.save(cahierDesCharges1);
		tx.commit();

		System.out.println("Le cahier des charges " + cahierDesCharges1.getIdCahierDesCharges()
				+ " a été ajouté à votre base de données.");
		
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();

		CahierDesCharges cahierDesCharges2 = new CahierDesCharges();
		cahierDesCharges2.setTypeSite("site vitrine");
		cahierDesCharges2.setTailleEntreprise("");
		cahierDesCharges2.setFonctionnalites(null);
		cahierDesCharges2.setTypeLicence("");

		session.save(cahierDesCharges2);
		tx.commit();
		
		System.out.println("Le cahier des charges " + cahierDesCharges2.getIdCahierDesCharges()
		+ " a été ajouté à votre base de données.");
		
		//update
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();

		cahierDesCharges2.setTypeSite("blog");

		session.update(cahierDesCharges2);
		tx.commit();
		
		System.out.println("Le cahier des charges " + cahierDesCharges1.getIdCahierDesCharges()
		+ " a bien été mis à jour.");
		
		//read
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();
		
		ArrayList<CahierDesCharges> cahierDesChargesListe = new ArrayList<CahierDesCharges>();

		cahierDesChargesListe = (ArrayList<CahierDesCharges>) session.createQuery("FROM CahierDesCharges").list();

		tx.commit();
		
		System.out.println("Voici la liste des types de sites" + cahierDesChargesListe);
		
		//delete
		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();

		session.delete(cahierDesCharges2);
		tx.commit();
		
		System.out.println("Un cahier des charges a été supprimé.");

		session = sessionFactory.getCurrentSession();
		tx = session.beginTransaction();
		
		cahierDesChargesListe = new ArrayList<CahierDesCharges>();

		cahierDesChargesListe = (ArrayList<CahierDesCharges>) session.createQuery("FROM CahierDesCharges").list();

		tx.commit();
		
		System.out.println("Voici la liste des types de sites" + cahierDesChargesListe);
		
	}
 
}

