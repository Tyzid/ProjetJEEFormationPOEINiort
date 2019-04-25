package fr.eni.ecole.projet.main.dal;

import java.sql.*;
import javax.naming.*;
import javax.sql.*;

public class DatabaseAccess {	
	public static Connection getConnection() throws SQLException{
		Connection cnx=null;
		InitialContext ctxJNDI;
		DataSource ds;
		try 
		{
			// TODO Remplir les identifiants pour la bdd dans le fichier context.xml
			ctxJNDI=new InitialContext();
			ds=(DataSource)ctxJNDI.lookup("java:comp/env/jdbc/projet");
			
			// TODO remplir les champs de connexion dans context.xml
			cnx=ds.getConnection();
		}
		catch (NamingException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cnx;
	}
}
