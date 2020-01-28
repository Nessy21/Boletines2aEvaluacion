package clasesyobjetos;

public class Coche extends Vehiculo{

	private int numeroPlazas;
	
	public Coche (String matricula, String tipo, int velocidadMaxima, int numeroPlazas) {
		this.setMatricula(matricula);
		this.setTipo(tipo);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setNumeroPlazas(numeroPlazas);
	}

	public void setNumeroPlazas (int numeroPlazas) {//get?
		this.numeroPlazas = numeroPlazas;
	}

	public void mostrarDatos() {
		System.out.println(numeroPlazas);
		super.mostrarDatos(); // examen fijo :D 
	}

	public void toString(Conductor con1) {
		String mensaje= "El conductor de este vehículo es: " + con1;
		System.out.println(mensaje);
		
		
	}
	
}
