package ar.com.unpaz.model;

public class Moto extends Vehiculo{
	public Moto( String patente, String marca, double combustible) {
		super(patente, marca, combustible);
	}
	@Override
	public void avanzar (int km) {
		double consumo = km / 20.0;
		
		if (combustible >= consumo) {
			combustible -= consumo;
			System.out.println("La moto avanzó   " + km + "km.");
		}
		else {
			System.out.println("La Moto no tiene combustible suficiente para avanzar.");
		}
	}

}

