package com.lvm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.lvm.model.Administrateur;
import com.lvm.dao.AdministrateurDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/ConnexionServlet")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String identifiant = request.getParameter("identifiant");
		String motDePasse = request.getParameter("motDePasse");
		Administrateur admin = new Administrateur();
		admin.setIdentifiant(identifiant);
		admin.setMotDePasse(motDePasse);
		AdministrateurDao dao = new AdministrateurDao();
		
		try
		{
		if(dao.connectUser(identifiant, motDePasse))
		{
		System.out.println("utilisateur connecté");
		HttpSession session = request.getSession(); //Creating a session
		session.setAttribute("administrateur", admin); //setting session attribute
		session.setAttribute("identifiant", admin.getIdentifiant());
		session.setAttribute("motDePasse", admin.getMotDePasse());
		//request.getRequestDispatcher("/evenementsVue.jsp").forward(request, response);
		}
		
		else
		{
		System.out.println("utilisateur pas connecté");
		//request.getRequestDispatcher("/connexionVue.jsp").forward(request, response);
		}
		}
		/*catch (IOException e1)
		{
		e1.printStackTrace();
		}*/
		catch (Exception e2)
		{
		e2.printStackTrace();
		}
		

		
	}

}
