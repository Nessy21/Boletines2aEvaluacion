package clasesyobjetos;

public class Vehiculo {

			//campos//
	
	private String matricula;
	private String tipo;
	private int velocidadMaxima;
	private Conductor conductor;

	public void setMatricula (String matricula) {
		this.matricula = matricula;
	}
	
	public void setTipo (String tipo) {
		this.tipo=tipo;
	}
	
	public void setVelocidadMaxima (int velocidadMaxima){
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public void setConductor (Conductor conductor) {
		this.conductor = conductor;
	}
	
	
	
	public void mostrarDatos() {
		System.out.println(matricula);
		System.out.println(tipo);
		System.out.println(velocidadMaxima + " km/h");
	}//mostrarDatos
	
	/*public String toString( String dni, String nombre) {
		
		String mensaje= "El conductor de este vehículo con dni: "+dni+ " es nombre " +nombre;
		
		return mensaje;
	}*/
	
}
