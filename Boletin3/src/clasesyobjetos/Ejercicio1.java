package clasesyobjetos;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Coche c1 = new Coche("1234SDF", "coche", 150, 5);
		
		Conductor con1 = new Conductor ("1234567A", "Manolo Pérez Palacios");
	
		c1.setConductor(con1); 
		c1.mostrarDatos();

		Remolque r1 = new Remolque ();//por utilizar contructor vacío
		r1.longitud=300;
		r1.matricula="1112SDF";
			
		Camion cami1= new Camion ("1123SDF", "camion", 120, r1);//120 vel max de camion definido en contructor
		cami1.setAltura(210);
		cami1.setConductor(con1);
		cami1.mostrarDatos();
	
		imprimirPolimorfismo(cami1);
		
		Camion cami2 = new Camion ("3123SDF", "camion", 90, r1);//creo un camion nuevo
		cami2.setAltura(210);
		cami2.setConductor(con1);
		cami2.mostrarDatos();//imprime datos de conductor también
		
	}
	
	//apartado 4 -> método 
	
	public static void imprimirPolimorfismo (Vehiculo v1) {
	
		v1.mostrarDatos();
		
	}//lo pones estatico para poder llamar en el main.
	
}
