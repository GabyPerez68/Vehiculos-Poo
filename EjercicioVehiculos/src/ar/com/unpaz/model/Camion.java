package ar.com.unpaz.model;

 public class Camion extends Vehiculo{
	 
	 public Camion(String patente, String marca, double combustible) {
		 super(patente, marca, combustible);
	 }
	 @Override
	 public void avanzar (int km) {
		 double consumo= km / 4.0;
		 
		 if (combustible >= consumo) {
			 combustible -= consumo;
			 System.out.println("El camion avanzó  " + km + "km.");
		 }
		 else {
			 System.out.println("El camión no tiene combustible suficiente para avanzar.");
		 }
	 }

}
