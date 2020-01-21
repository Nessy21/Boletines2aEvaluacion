
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

	public class Persona {
	
		// campos //
		
			public String nombre;
			public String apellidos;
			public int estatura;
			public LocalDate fechaNac;
			public long edad;

		//métodos//

	public void mostrarDatos() {
			System.out.println(nombre);
			System.out.println(apellidos);
			System.out.println(estatura + " cm");
			edad = obtenerEdad();
			System.out.println(fechaNac + "\n");
			
	
	}//mostrarDatos
	
	public long obtenerEdad() {
	
		Long edad = ChronoUnit.YEARS.between(fechaNac, LocalDate.now());
		System.out.println(edad + " años");
		return edad;
	}//obtenerEdad 



		//constructores//
	
	public Persona (String nom, String apell, LocalDate fechNac ){
		nombre=nom;
		apellidos=apell;
		fechaNac= fechNac;
	}
	public Persona () {}//vacio que es el por defecto, en cuanto haces un constructor el por defecto desaparece.

	
	
	
	}//persona

