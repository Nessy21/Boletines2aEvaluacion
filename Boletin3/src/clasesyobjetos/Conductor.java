package clasesyobjetos;

public class Conductor {

	public String dni;
	public String nombre;
	
	public Conductor (String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		String mensaje = "El DNI del conductor es: " + dni + " y el nombre es: " + nombre;
		return mensaje;
	}
}//class


