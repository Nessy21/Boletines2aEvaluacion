import java.time.LocalDate;

public class Ejercicio1 {


		public static void main(String[] args) {
		
			Persona p1 = new Persona();
			p1.nombre = "Jose";
			p1.apellidos = "Rodríguez Mata";
			p1.fechaNac = LocalDate.of(1965, 01, 15);
			p1.estatura=165;
			
			p1.mostrarDatos();
			
			
			Persona p2 = new Persona();
			p2.nombre = "María";
			p2.apellidos = "Sánchez Gómez";
			p2.fechaNac = LocalDate.of(1980, 12, 26);
			p2.estatura=170;
			
			p2.mostrarDatos();
		
			Persona p3 = new Persona();
			p3.nombre = "Alejandro";
			p3.apellidos = "Gómez Gómez";
			p3.fechaNac = LocalDate.of(2001, 11, 01);
			p3.estatura=190;
			
			p3.mostrarDatos();
			
			Persona p4 = new Persona();
			p4.nombre = "Jose Manuel";
			p4.apellidos = "Pérez Pons";
			p4.fechaNac = LocalDate.of(2010, 05, 01);
			p4.estatura=127;
			
			p4.mostrarDatos();
			
			Persona p5 = new Persona ("Lorena", "Remeseiro Neira", LocalDate.of(2000, 06, 12));
			p5.estatura=160;
			p5.mostrarDatos();
			
			Persona p6 = new Persona ("Patricia", "Seoane Álvarez", LocalDate.of(1976, 8, 23));
			p6.estatura=175;
			p6.mostrarDatos();
			
	}

}
