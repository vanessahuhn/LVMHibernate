package com.lvm.controleur;

import java.io.IOException;
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
@WebServlet("/CreateServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

}
