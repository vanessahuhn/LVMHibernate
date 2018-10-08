package com.lvm.controleur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lvm.dao.CRUDCahierDesChargesDao;
import com.lvm.model.CahierDesCharges;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/Servlet")
public class CRUDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CRUDCahierDesChargesDao dao = new CRUDCahierDesChargesDao();
		
		List<CahierDesCharges> cahierDesChargesListe = dao.readCahierDesCharges();
		System.out.println("Voici la liste des types de sites" + cahierDesChargesListe);

		
		if(cahierDesChargesListe != null & cahierDesChargesListe.size() > 0) {
	
	        	request.setAttribute("cahierDesChargesListe", cahierDesChargesListe);
	    		
	    		request.getRequestDispatcher("CRUDCahierDesChargesVue.jsp").forward(request, response);
	
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typeSite = request.getParameter("typeSite");
		String tailleEntreprise = request.getParameter("tailleEntreprise");
		String typeLicence = request.getParameter("typeLicence");
		
		CahierDesCharges cahierDesCharges = new CahierDesCharges();
		
		cahierDesCharges.setTypeSite(typeSite);
		cahierDesCharges.setTailleEntreprise(tailleEntreprise);
		cahierDesCharges.setTypeLicence(typeLicence);
		
		CRUDCahierDesChargesDao dao = new CRUDCahierDesChargesDao();
		dao.createCahierDesCharges(cahierDesCharges);
		
		
	}
	
	private void read(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		CRUDCahierDesChargesDao dao = new CRUDCahierDesChargesDao();
		
		List<CahierDesCharges> cahierDesChargesListe = dao.readCahierDesCharges();
		System.out.println("Voici la liste des types de sites" + cahierDesChargesListe);

		
		if(cahierDesChargesListe != null & cahierDesChargesListe.size() > 0) {
	
	        	request.setAttribute("cahierDesChargesListe", cahierDesChargesListe);
	    		
	    		request.getRequestDispatcher("CRUDCahierDesChargesVue.jsp").forward(request, response);
	
	        }
		
		
		
    }
	
	private void create(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
		
		String typeSite = request.getParameter("typeSite");
		String tailleEntreprise = request.getParameter("tailleEntreprise");
		String typeLicence = request.getParameter("typeLicence");
		
		CahierDesCharges cahierDesCharges = new CahierDesCharges();
		
		cahierDesCharges.setTypeSite(typeSite);
		cahierDesCharges.setTailleEntreprise(tailleEntreprise);
		cahierDesCharges.setTypeLicence(typeLicence);
		
		CRUDCahierDesChargesDao dao = new CRUDCahierDesChargesDao();
		dao.createCahierDesCharges(cahierDesCharges);
		
	}

}
