package fr.eni.ecole.projet.main.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ecole.projet.main.bo.Restaurant;

/**
 * Servlet implementation class ListRestaurants
 */
@WebServlet("/ListRestaurants")
public class ListRestaurants extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		try {
			
			//Récupérer les données dans la bdd
//			List<Restaurant> restaurants = DAOFactory.getRestaurantDAO().loadAll();
//			request.setAttribute("restaurants", restaurants);
			
			List<Restaurant> restaurants = new ArrayList<>();
			restaurants.add(new Restaurant("restaurant 1", "30 avenue Louis Moulin 44000 Nantes", "restaurant-1"));
			restaurants.add(new Restaurant("restaurant 2", "9 boulevard de la république 35000 Rennes","restaurant-2"));
			restaurants.add(new Restaurant("restaurant 3", "30 avenue Louis Moulin 44000 Nantes", "restaurant-3"));
			
			
			request.setAttribute("restaurants", restaurants);
			
			//Redirection
			String redirection = (String)request.getAttribute("redirection");
			RequestDispatcher dispatcher = request.getRequestDispatcher(redirection);
			dispatcher.forward(request,response);
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
