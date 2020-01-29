package clasesyobjetos;

public class Remolque {


	public String matricula;
	public int longitud;

	@Override
	public String toString() {
		String mensaje = "La matricula del remolque es: " + matricula + " y la longitud es de: " + longitud + " cm.";
		return mensaje;
	}
}
