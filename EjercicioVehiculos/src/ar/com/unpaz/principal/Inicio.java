package ar.com.unpaz.principal;

import ar.com.unpaz.model.Vehiculo;
import ar.com.unpaz.model.Auto;
import ar.com.unpaz.model.Moto;
import ar.com.unpaz.model.Camion;


import java.util.ArrayList;


public class Inicio {
	public static void main( String[]arg) {
		//Polimorfismo Lista de vehiculos
		ArrayList<Vehiculo> vehiculos =new ArrayList<>();
		//Creacion de objetos
		vehiculos.add(new Auto("GIA315", "Peugeot", 50.0));
		vehiculos.add(new Camion("JLM456", "Ford", 10.0));
		vehiculos.add(new Moto("LMN678", "Honda", 4.0));
		
		
		//Recorrido de lista
		for (Vehiculo v : vehiculos) {
			v.avanzar(60);
			//Muestra datos
			
			System.out.println("Tipo de vehículo:  " + v.getClass().getSimpleName());
			System.out.println("Patente:  "+ v.getPatente());
			System.out.println("Marca:  "+ v.getMarca());
			
		
			//Muestra el combustible restante
			System.out.println("Combustible restante:  "+ v.getCombustible());
			
			
			System.out.println("-------------------------------------------------");
		}
				
	}

}
