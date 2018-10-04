package com.lvm.dao;
 
import java.util.ArrayList;
import java.util.List;
 
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
 
import com.lvm.model.Administrateur;
import com.lvm.util.HibernateUtil;

//DAO = Data Access Object

public class AdministrateurDao {
 

/* Methode pour ajouter un utilisateur */   
 public boolean connectUser(String identifiant, String motDePasse) {
        //unit of work : une ou plusieurs queries, c'est mieux de faire une requête = une transaction
	 	Transaction trns = null;
        //une session est une connexion à la bdd
	 	//on ouvre une connexion avec la bdd
	 	Session session = HibernateUtil.getSessionFactory().openSession();
        try {
        	trns = session.beginTransaction();
            String queryString = "from Administrateur admin where admin.identifiant = :identifiant and admin.motDePasse = SHA2( :motDePasse ,0)";
            List<Administrateur> admins = new ArrayList<Administrateur>();
            Query query = session.createQuery(queryString);
            query.setParameter("identifiant", identifiant);
            query.setParameter("motDePasse", motDePasse);
            admins = query.list();
            
            if(admins != null && admins.size() > 0)
        		System.out.println("mail et mot de passe OK");
        		return true;
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return false;
    }
}
