package ar.com.unpaz.model;

public abstract class Vehiculo { //clase abstracta
	 protected String patente;
	 protected String marca;
	 protected double combustible;
    //constructor
	public Vehiculo(String patente, String marca, double combustible)  {
		this.patente = patente;
		this.marca = marca;
		this.combustible = combustible;
				}
	//Getters
	public String getPatente() {
		return patente;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getCombustible() {
		return combustible;
	}
	// Metodo abstracto
	public abstract void avanzar(int km);
	
}

