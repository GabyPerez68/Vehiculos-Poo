package ar.com.unpaz.model;

public class Auto extends Vehiculo{
	
	public Auto(String patente, String marca, double combustible){
           super(patente,marca,combustible);
	}
@Override
 public void avanzar(int km) {
	double consumo = km / 10.0;
	
	if ( combustible >= consumo) {
		combustible-= consumo;
		System.out.println("El auto avanzó  " + km + "km.");
		}
	else {
		System.out.println("El auto no posse combustible suficiente para avanzar.");
	}
}
}