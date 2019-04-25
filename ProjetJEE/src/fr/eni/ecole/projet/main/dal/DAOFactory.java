package fr.eni.ecole.projet.main.dal;

public class DAOFactory {

	public static RestaurantDAO getRestaurantDAO() {
		return new  RestaurantDAO();
	}
	
}
