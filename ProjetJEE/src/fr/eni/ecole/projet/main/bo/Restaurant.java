package fr.eni.ecole.projet.main.bo;

import java.io.Serializable;

public class Restaurant implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int idRestaurant;
    private String name;
    private String adress;
    private String imageName;

    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Restaurant () {

    }
    
    
    public Restaurant(int idRestaurant, String name, String adress, String imageName) {
		this(name,adress,imageName);
		this.idRestaurant = idRestaurant;
	}
    
    public Restaurant(String name, String adress, String imageName) {
		this.name = name;
		this.adress = adress;
		this.imageName = imageName;
	}

	public Restaurant (int idRestaurantIn) {

          this.idRestaurant = idRestaurantIn;
    }
    
    /** 
     * Get- and Set-methods for persistent variables. The default
     *
 so these might require some manual additions.
     */

    public int getIdRestaurant() {
          return this.idRestaurant;
    }
    public void setIdRestaurant(int idRestaurantIn) {
          this.idRestaurant = idRestaurantIn;
    }
    public String getName() {
          return this.name;
    }
    public void setName(String nameIn) {
          this.name = nameIn;
    }

    public String getAdress() {
          return this.adress;
    }
    public void setAdress(String adressIn) {
          this.adress = adressIn;
    }

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer();
        out.append("\nclass Restaurant, mapping to table Restaurant\n");
        out.append("Persistent attributes: \n"); 
        out.append("idRestaurant = " + this.idRestaurant + "\n"); 
        out.append("name = " + this.name + "\n"); 
        out.append("adress = " + this.adress + "\n"); 
        return out.toString();
    }


}
